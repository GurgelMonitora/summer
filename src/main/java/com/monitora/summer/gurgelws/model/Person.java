package com.monitora.summer.gurgelws.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Person {
  private @Id @GeneratedValue Long id;
  private String nome;
  private Date dataNascimento;
  private String endereco;

  public Person ()  {

  }
  
  public Person(String name, String endereco, Date nascimento) {
    this.nome = name;
    this.dataNascimento = nascimento;
    this.endereco = endereco;
  }
}
