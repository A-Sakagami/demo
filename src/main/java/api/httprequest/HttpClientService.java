package api.httprequest;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientService {

    private final CloseableHttpClient httpClient;

    public HttpClientService(CloseableHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String sendRequest(String url) throws Exception {
        HttpGet request = new HttpGet(url);

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new Exception("Failed to get successful response");
            }
            return EntityUtils.toString(response.getEntity());
        }
    }
}
