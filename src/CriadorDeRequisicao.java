import java.net.URI;
import java.net.http.HttpRequest;

public class CriadorDeRequisicao {
    public static HttpRequest criar(String moedaBase, String moedaAlvo) {
        String url = "https://v6.exchangerate-api.com/v6/97544bc55eca2c963b0320a8/pair/" + moedaBase + "/" + moedaAlvo;
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }
}
