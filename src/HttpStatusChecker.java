import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    String getStatusImage(int code) throws Exception{
        String imageUrl = "https://http.cat/" + code + ".jpg";
        URL url = new URL(imageUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 404) {
            throw new Exception("Image not found");
        }

        return imageUrl;
    }
}
