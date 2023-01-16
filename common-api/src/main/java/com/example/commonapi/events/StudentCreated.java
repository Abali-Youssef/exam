package com.example.commonapi.events;

import com.example.commonapi.enums.Genre;
import lombok.Getter;

public class StudentCreated extends BaseEvent<Long> {
    @Getter
    private String nom;
    @Getter private String prenom;
    @Getter private Genre genre;
    @Getter private String photo;



    public StudentCreated(Long id,String nom, String prenom, Genre genre, String photo) {
        super(id);

        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.photo = photo;
    }
}
