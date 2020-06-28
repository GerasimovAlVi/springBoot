package ru.gerasimov.se.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private Long id;
}
