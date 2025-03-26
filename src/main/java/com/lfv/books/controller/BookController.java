package com.lfv.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
// @RestController
@Controller
@RequestMapping("api/books")


public class BookController {

    @GetMapping("/")
    public String requestMethodName(@RequestParam String param) {
        return "index";
    }
}
