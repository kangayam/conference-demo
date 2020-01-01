package com.conference.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/* 1) Create Speaker JPA Entity
/*    a) Add all fields to map to speaker table.
/*    b) Annotate the class
/*    c) Add Default constructor
/*    d) Create or generate Getter and Setters */


@Entity(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyinitialzer", "handler"})
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    public List<Session> sessions;


    // Add default constructor
    public Speaker() {
    }

    // Create or generate Getter and Setter
    public Long getSpeaker_id() {
        return Speaker_id;
    }
    public void setSpeaker_id(Long speaker_id) {
        Speaker_id = speaker_id;
    }
    public String getFirst_name() {return first_name;}
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getSpeaker_bio() {
        return speaker_bio;
    }
    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }
    public List<Session> getSessions() {
        return sessions;
    }
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
    public byte[] getSpeaker_photo() {return speaker_photo;}

    public void setSpeaker_photo(byte[] speaker_photo) {
        this.speaker_photo = speaker_photo;
    }



// @JsonIgnore



}