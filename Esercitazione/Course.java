package com.ntt.springbootdemo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse", nullable = false)
    private Long idCourse;
    private String nome;
    private String descrizione;

}