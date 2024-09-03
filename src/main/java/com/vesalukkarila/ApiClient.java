package com.vesalukkarila;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import com.google.gson.Gson;

import java.io.IOException;

public class ApiClient {

    public User fetchUserData(String apiUrl) throws IOException {
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            return httpClient.execute(new HttpGet(apiUrl), response -> {
                String jsonResponse = EntityUtils.toString(response.getEntity());
                Gson gson = new Gson();
                return gson.fromJson(jsonResponse, User.class);
            });
        }
    }
}
