package com.peaksoft.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    @SequenceGenerator(name = "question_seq", sequenceName = "question_seq", allocationSize = 1)
    @GeneratedValue(generator = "question_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String text;

    private Integer duration;

    private Integer numberOfRespondents;

    private Boolean isCorrect = false;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Option> options;

}
