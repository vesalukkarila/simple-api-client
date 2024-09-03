package com.vesalukkarila;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //Create instance of ApiClient
        //Set url
        ApiClient apiClient = new ApiClient();
        String apiUrl = "https://jsonplaceholder.typicode.com/users/1";
        //With try-catch, call client fetchUserData using url
        //print user´s information
        try {
            User user = apiClient.fetchUserData(apiUrl);
            System.out.println(user);
        } catch (Exception e) {
            System.out.println("Failed to fetch data: " + e.getMessage());
        }

        //In catch-clause, handle exception

    }
}
