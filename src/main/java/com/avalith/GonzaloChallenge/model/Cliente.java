package com.avalith.GonzaloChallenge.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Document(collection = "hotel-cliente")
public class Cliente {

    private @Id @GeneratedValue int id;
    private int dni;
    private String nombre;
    private String apellido;
    private String celular;
    private String ciudadDeOrigen;
    private Habitacion numHabitacion;
    private int cantDias;


}
