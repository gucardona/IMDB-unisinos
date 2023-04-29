package unisinos.imdb.main;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class AcessoIMDBApi {

    /*
     * Acesso a Base de Dados IMDB via API
     *
     *
     *  Link Atual: http://www.omdbapi.com/
     *  Primeiro, cadastre um usu�rio para gerar uma chave de acesso.
     *  Depois, altere a constante SUA_CHAVE, incluindo a chave gerada.
     */
    //Link: https://imdb-api.com/api (Decrecated!)

    private static final String SUA_CHAVE = "k_b4e7o4ah";//<Sua chave aqui>";
    private static String pesquisa = "theoffice";
    private static Gson gson = new Gson();


    private static final String API_LINK = "https://imdb-api.com/en/API/Search/" + SUA_CHAVE +
            "/" + pesquisa;

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
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
