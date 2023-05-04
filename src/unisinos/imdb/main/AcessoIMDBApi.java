package unisinos.imdb.main;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class AcessoIMDBApi {

    private static final String SUA_CHAVE = "k_b4e7o4ah";//<Sua chave aqui>";

    private static final String pesquisa = "The%20Office";
    private static final String genero = "comedy";
    private static final String serieOuFilme = "tv_series";
    private static final int ano = 2005;

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

                String caminho = "C:\\Users\\Gustavo\\Documents\\projects\\imdb_unisinos\\json.json";
                Gson gson = new Gson();

                // Analisa string de resposta em um objeto JSON
                JsonObject json = gson.fromJson(response.body(), JsonObject.class);

                // Escreve objeto JSON em um arquivo
                FileWriter fw = new FileWriter(caminho);
                PrintWriter pw = new PrintWriter(fw);

                pw.print(gson.toJson(json));

                pw.close();
                fw.close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
