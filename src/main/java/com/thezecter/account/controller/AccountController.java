package com.thezecter.account.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Map.entry;

@RestController
@RequestMapping("v1")
public class AccountController {

    private final Environment environment;

    public AccountController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("list")
    public Map<String, String> accountList() {
        return Map.ofEntries(
                entry("success","200"),
                entry("message","The account list"),
                entry("port",this.environment.getProperty("local.server.port"))
        );
    }

}
