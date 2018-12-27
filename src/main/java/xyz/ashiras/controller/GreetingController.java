package xyz.ashiras.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("greeting")
public class GreetingController {

  @Autowired
  GreetingService service;

  @GetMapping()
  List<Books> get(@RequestParam(value = "name", defaultValue = "") String name) {
    return name.isEmpty() ? this.service.findAll() : this.service.searchByName(name);
  }

  @PostMapping()
  void post(@RequestBody Books books) {
    // code
  }

  @PutMapping()
  void put(@RequestBody Books books) {
    // code
  }

  @DeleteMapping()
  void delete(@RequestParam(value = "name", defaultValue = "World") String name) {
    // code
  }

  @PatchMapping()
  void patch(@RequestParam(value = "name", defaultValue = "World") String name) {
    // code
  }
}
