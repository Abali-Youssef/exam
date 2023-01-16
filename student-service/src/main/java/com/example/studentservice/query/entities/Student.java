package com.example.studentservice.query.entities;

import com.example.studentservice.query.enums.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student  {
    @Id
   private Long id ;
    private String nom;
  private String prenom;
     private Genre genre;
     private String photo;


}
