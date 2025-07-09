import com.google.gson.Gson;

public class ConversorJson {
    private static final Gson gson = new Gson();

    public static Conversao converter(String json) {
        return gson.fromJson(json, Conversao.class);
    }
}
