package com.monitora.summer.gurgelws.controller;

import java.util.Date;

import com.monitora.summer.gurgelws.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping(value = "/")
  public String hello(){
    return "Hello Summer!";
  }


  @RequestMapping(value = "/person")
  public Person getPerson(){
    Person person = new Person("Paulo", "Rua", new Date());
    person.setNome("Paulo");
    person.setEndereco("Rua");
    person.setDataNascimento(new Date());
    return person;
  }
}
