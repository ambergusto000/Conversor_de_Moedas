import java.net.http.HttpClient;

public class ClienteHttp {
    private static final HttpClient client = HttpClient.newHttpClient();

    public static HttpClient getClient() {
        return client;
    }
}
