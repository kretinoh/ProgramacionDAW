package openWeather;

/**
 * Usando la API de OpenWether vamos a pedir pronóstico de una ciudad que se le pasa como parámetro
 * al programa Mostrar: -Temperatura media -Temperatura mínima -Temperatura máxima
 * 
 * @author KR371N0H
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import com.google.gson.Gson;

public class Ejercicio1 {
  // Utilizamos constantes para formar la url que no cambiará
  static final String OPEN_WEATHER_KEY = "ad82d11d23a4926b9da5e646076e4205";
  private static final String ROOT_ENDPOINT = "http://api.openweathermap.org/data/2.5/forecast";

  /**
   * Aquí vamos a ver si la petición la hace correctamente, buildeando el body (capturando
   * excepciones) y también mostramos los datos del JSON
   * 
   * @param args
   */
  public static void main(String[] args) {
    try {
      String jsonResponde = getResponseOpenWM();
      mostrarDatos(jsonResponde);
    } catch (IOException | InterruptedException e) {
      System.out.println("Error al hacer la petición " + e.getMessage());
    }
  }

  /**
   * Para hacer la petición necesitaremos el cliente, la petición request y la respuesta de la
   * página además hemos añadido un if donde miramos si el codigo que nos devuelve es 200
   * 
   * @return
   * @throws IOException
   * @throws InterruptedException
   */
  private static String getResponseOpenWM() throws IOException, InterruptedException {
    String ciudad = pedirCiudad();

    String params = "?q=" + ciudad + "&appid=" + OPEN_WEATHER_KEY + "&units=metric&lang=es";
    String endpoint = ROOT_ENDPOINT + params;

    // El cliente es nuestro "navegador" donde enviamos las peticiones request
    HttpClient client = HttpClient.newHttpClient();

    // El cliente va a hacer una solicitud
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endpoint)).GET().build();

    // Resultado de la llamada "HttpRequest" debemos de indicar como manejar el cuerpo de la
    // respuesta
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    if (response.statusCode() != 200) {
      System.out.println("No se ha podido hacer la petición. Error " + response.statusCode());
    }
    return response.body();
  }

  /**
   * 
   * @return
   */
  private static String pedirCiudad() {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la ciudad para hacer la búsqueda> ");
    String ciudad = s.nextLine();
    return ciudad;
  }

  /**
   * 
   * @param json
   */
  private static void mostrarDatos(String json) {
    Gson gson = new Gson();
    Pronostico dto = gson.fromJson(json, Pronostico.class);
    for (List lista : dto.getList()) {
      mostrarMediciones(lista);
    }
  }

  /**
   * Accediendo a la lista vamos a sacar los datos que necesitamos
   * 
   * @param lista
   */
  private static void mostrarMediciones(List lista) {
    System.out.println("----------------------");
    System.out.println("· " + lista.getDtTxt());
    System.out.println("Temperatura media");
    System.out.println((lista.getMain().getTempMin() + lista.getMain().getTempMax()) / 2);
    System.out.println("Temperatura mínima");
    System.out.println(lista.getMain().getTempMin());
    System.out.println("Temperatura máxima");
    System.out.println(lista.getMain().getTempMax());
  }
}
