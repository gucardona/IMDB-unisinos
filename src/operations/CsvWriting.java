package operations;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class CsvWriting {
    public static void leJsonEscreveCSV() throws IOException {
        // Lendo o arquivo JSON
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("json.json"));

        // Abrindo arquivo CSV para escrita
        CSVWriter csvWriter = new CSVWriter(new FileWriter("csv.csv"), ';', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);

        // Escrevendo o header no arquivo CSV
        String[] header = {"id", "image", "title", "year", "runtime", "genres", "genre list", "content rating",
                "imdb rating", "imdb rating votes", "metacritic rating", "plot", "stars"};

        csvWriter.writeNext(header);

        // Escrevendo o conteúdo no arquivo CSV
        ArrayNode arrayNode = (ArrayNode) rootNode.get("results");
        Iterator<JsonNode> elements = arrayNode.elements();
        while (elements.hasNext()) {
            JsonNode element = elements.next();
            String[] content = new String[element.size()];
            Iterator<String> fieldNames2 = element.fieldNames();
            int j = 0;
            while (fieldNames2.hasNext()) {
                String fieldName = fieldNames2.next();
                content[j] = element.get(fieldName).asText();
                j++;
            }
            csvWriter.writeNext(content, true);
        }

        csvWriter.close();
    }
}
