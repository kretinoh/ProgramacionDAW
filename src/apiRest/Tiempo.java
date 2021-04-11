package apiRest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import com.google.gson.Gson;

/**
 * Si java tiene que acceder a la web necesita el navegador (cliente httpClient) este recibirá las respuestas
 * pediremos al usuario
 * 
 * @author KR371N0H
 *
 */
public class Tiempo {

  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner s = new Scanner(System.in);
    
    HttpClient client = HttpClient.newHttpClient();
    
    System.out.println("Introduce la url a buscar: ");
    String url = s.nextLine();
    
    HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println("Status Code: " + response.statusCode());
    System.out.println("HTML devuelto:\n" + response.body());
    
  }
//  void muestraDatos(String response) {
//    Gson gson = new Gson();
//    DtoTiempo dto = gson.fromJson(response, TiempoJson.class);
//    
//    for(Result result: dto.getResults()) {
//      
//    }
//  }
  

}
