package com.example.Calling.Rest.rest;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UsersService {

    private final WebClient webClient;
    public UsersService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://jsonplaceholder.typicode.com/")
                .build();
    }

    //method that we can call to fetch users
    public User[] getUsers(){
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();
    }
}
