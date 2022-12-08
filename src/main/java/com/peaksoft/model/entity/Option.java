package com.peaksoft.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "options")
public class Option {
    @Id
    @SequenceGenerator(name = "option_seq", sequenceName = "option_seq", allocationSize = 1)
    @GeneratedValue(generator = "option_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String file;

    private Boolean isCorrect = false;

}
