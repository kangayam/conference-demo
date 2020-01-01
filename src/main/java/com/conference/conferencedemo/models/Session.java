package com.conference.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.persistence.*;
import java.util.List;

/* 1) Create Sessions JPA Entity
/*    a) Add all fields to map it to the session table.
/*    b) Annotate the class and primary key
/*    c) Add Default constructor
/*    d) Create or generate Getter and Setters */



@Entity(name ="sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {

    //Map the Session Table columns to the java attributes in the session class - Start
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;
    //Map the Session Table columns to the java attributes in the session class - End

    @ManyToMany
    @JoinTable(
        name = "session_speakers",
        joinColumns = @JoinColumn(name = "session_id"),
        inverseJoinColumns=@JoinColumn(name="speaker_id"))


    // Define the relationship with Speaker
    private List<Speaker> speakers;


    //Add Default Constructor  - Start
    public Session(){
    }
    //Add Default Constructor  - End

    // Define the relationship with Speaker


    //Create or generate Getter and Setters for Sessions - Start
    public Long getSession_id() {return session_id;}
    public void setSession_id(Long session_id) {this.session_id = session_id;}
    public String getSession_name() { return session_name;}
    public void setSession_name(String session_name) {this.session_name = session_name;}
    public String getSession_description() {return session_description;}
    public void setSession_description(String session_description) {  this.session_description = session_description;}
    public Integer getSession_length() {return session_length;}
    public void setSession_length(Integer session_length) {this.session_length = session_length;}
    // Create or generate Getters and Setters for Sessions - End


    //Create or generate Getter and Setters for Speaker relation - Start
    public List<Speaker> getSpeakers() {return speakers;}
    public void setSpeakers(List<Speaker> speakers) {this.speakers = speakers;}
    //Create or generate Getter and Setters for Speaker relation - End

}


