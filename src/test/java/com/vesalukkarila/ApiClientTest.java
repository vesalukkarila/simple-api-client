package com.vesalukkarila;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApiClientTest {

    @Test
    public void testFetchUserData() {
        ApiClient apiClient = new ApiClient();
        String apiUrl = "https://jsonplaceholder.typicode.com/users/1";
        try {
            User user = apiClient.fetchUserData(apiUrl);
            assertNotNull(user);
            assertEquals("Leanne Graham", user.getName());
            assertEquals("Sincere@april.biz", user.getEmail());
        } catch (Exception e) {
            fail("Exception thrown " + e.getMessage());
        }
    }
}
