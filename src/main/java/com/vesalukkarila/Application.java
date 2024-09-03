package com.vesalukkarila;

public class Application {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        String apiUrl = "https://jsonplaceholder.typicode.com/users/1";
        try {
            User user = apiClient.fetchUserData(apiUrl);
            System.out.println(user);
        } catch (Exception e) {
            System.out.println("Failed to fetch data: " + e.getMessage());
        }
    }
}
