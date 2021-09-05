package com.ouhamza.spring.data.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
  @Id
  private String id;

  private String name;
  private String email;
  private boolean isTennager;


}
