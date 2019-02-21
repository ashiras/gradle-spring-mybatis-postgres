package xyz.ashiras.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.ashiras.model.Books;
import xyz.ashiras.service.GreetingService;

/**
 * Books API
 * 
 * @author Fumio SAGAWA
 */
@RestController
@RequestMapping("hello")
public class HelloController {

  @Autowired
  GreetingService service;

  @GetMapping()
  String get() {
    return "Hello World";
  }
}
