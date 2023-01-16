package com.example.studentservice.commands.aggregates;

import com.example.commonapi.commands.CreateStudentCommand;
import com.example.commonapi.enums.Genre;
import com.example.commonapi.events.StudentCreated;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
@Slf4j
public class StudentAgregate {
    @AggregateIdentifier
    private Long id ;
    private String nom;
    private String prenom;
    private Genre genre;
    private String photo;

    public StudentAgregate() {
    }
    @CommandHandler
    public void RadarAggregate(CreateStudentCommand command) {

        AggregateLifecycle.apply(new StudentCreated(
                command.getId(),
                command.getNom(),
                command.getPrenom(),
                command.getGenre(),
                command.getPhoto()));
    }
    @EventSourcingHandler //change the state of the aggregate
    public void on(StudentCreated event){
        this.id = event.getId();
        this.nom = event.getNom();
        this.prenom = event.getPrenom();
        this.genre=event.getGenre();
        this.photo=event.getPhoto();
    }
}
