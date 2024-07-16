package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "responses")
@Data
public  class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User giver;
    @OneToOne
    private User taker;
    @OneToOne
    private TextQuestion question;
    @OneToOne
    private Course course;//required in academic feedback only
    @Column
    private String textResponse;//relevant in text questions
    @Column
    private float mcqResponse;//relevant in Mcq questions
}
