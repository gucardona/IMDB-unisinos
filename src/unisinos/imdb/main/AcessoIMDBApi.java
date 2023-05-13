package unisinos.imdb.main;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.opencsv.CSVWriter;
import operations.CsvWriting;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class AcessoIMDBApi {

    private static final String SUA_CHAVE = "k_b4e7o4ah";//<Sua chave aqui>";

    private static final String pesquisa = Teclado.leString("Qual o nome da mídia que deseja buscar?")
            .toLowerCase().replace(" ", "%20");
    private static final String genero = Teclado.leString("Qual o gênero? (Em Inglês)").toLowerCase();
    private static final String serieOuFilme = Teclado.leString("Série ou filme? (Escreva tv_series ou tv_movies)").toLowerCase();
    private static final int ano = Teclado.leInt("Qual o ano?");

    private static final String API_LINK = "https://imdb-api.com/en/API/AdvancedSearch/" + SUA_CHAVE + "?title=" + pesquisa +
            "&title_type=" + serieOuFilme + "&year=" + ano + "&genres=" + genero;

    private static final String TOP_250_MOVIES = "https://imdb-api.com/en/API/Top250TVs/" + SUA_CHAVE;
    private static final String TOP_250_TVS = "https://imdb-api.com/en/API/Top250TVs/" + SUA_CHAVE;
    private static final String TOP_MOST_POPULAR_MOVIES = "https://imdb-api.com/en/API/MostPopularMovies/" + SUA_CHAVE;
    private static final String TOP_MOST_POPULAR_TVS = "https://imdb-api.com/en/API/MostPopularTVs/" + SUA_CHAVE;

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_LINK)).build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                System.out.println(response.body());
                System.out.println(API_LINK);

                String jsonFilePath = ".\\json.json";

                FileWriter fw = new FileWriter(jsonFilePath);
                PrintWriter pw = new PrintWriter(fw);

                pw.print(response.body());

                pw.close();
                fw.close();

                CsvWriting.leJsonEscreveCSV();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
