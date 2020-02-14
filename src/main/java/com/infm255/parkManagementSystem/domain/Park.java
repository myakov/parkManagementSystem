package com.infm255.parkManagementSystem.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "park")
public class Park implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToOne(cascade = CascadeType.ALL)
    private Attractions attractions;

    @OneToOne(cascade = CascadeType.ALL)
    private Manager manager;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String city;


}
