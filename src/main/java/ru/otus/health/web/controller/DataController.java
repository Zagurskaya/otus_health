package ru.otus.health.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.health.web.response.Response;

@RestController
@RequestMapping("health")
public class DataController {

    @GetMapping()
    public Response health() {

        return new Response("OK");
    }
}
