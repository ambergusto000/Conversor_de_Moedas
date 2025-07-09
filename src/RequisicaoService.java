import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequisicaoService {
    public static String enviar(HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = ClienteHttp.getClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
