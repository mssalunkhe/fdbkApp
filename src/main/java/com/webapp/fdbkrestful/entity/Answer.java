package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Feedback feedback;
    @OneToOne
    private User giver;
    @OneToOne
    private User taker;
    @OneToOne
    private Question question;
    @Column
    private String answer;
}
