package openWeather;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;

public class Ejercicio1 {
  static final String OPEN_WEATHER_KEY = "ad82d11d23a4926b9da5e646076e4205";
  private static final String ROOT_ENDPOINT = "http://api.openweathermap.org/data/2.5/forecast";
  private static final String PARAMS =
      "?q=London&appid=" + OPEN_WEATHER_KEY + "&units=metric&lang=es";

  public static void main(String[] args) {
    try {
      String jsonResponde = getResponseOpenWM();
      mostrarDatos(jsonResponde);
    } catch (Exception e){
      System.out.println(e);
    }
  }

  private static String getResponseOpenWM() throws IOException, InterruptedException {
    String endpoint = ROOT_ENDPOINT + PARAMS;

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endpoint)).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    if (response.statusCode() != 200) {
      System.out.println("No se ha podido hacer la petición. Error " + response.statusCode());
    }else {
      response.statusCode();
    }
    return endpoint;
    
  }

  private static void mostrarDatos(String json) {    
    Gson gson = new Gson(); 
    Pronostico dto = gson.fromJson(json, Pronostico.class);
    
    for(List lista : dto.getList()) {
//      mostrarMediciones(lista);
//      mostrarLocalizacion(lista);
      System.out.println(lista.getMain().getTempMin());
      //System.out.println(lista.getMain().getHumidity());
    }    
//    dto.getList().get(0).getMain().getTempMax();
  }
  
//  private static void mostrarMediciones(List<Measurement> list)

}
