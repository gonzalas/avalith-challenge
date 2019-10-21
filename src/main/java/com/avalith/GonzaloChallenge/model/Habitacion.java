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
@Document(collection = "hotel-habitacion")
public class Habitacion {

    private @Id @GeneratedValue int id;
    private int cantCamas;
    private int cantPersonas;
    private String servicios;
    private float precio;
    private boolean disponible = true;
    private boolean enLimpieza = false;
    private boolean fueraDeServicio = false;

    public Habitacion(int id, int cantCamas, int cantPersonas, String servicios, float precio, boolean disponible, boolean enLimpieza, boolean fueraDeServicio) {
        this.id = id;
        this.cantCamas = cantCamas;
        this.cantPersonas = cantPersonas;
        this.servicios = servicios;
        this.precio = precio;
        this.disponible = disponible;
        this.enLimpieza = enLimpieza;
        this.fueraDeServicio = fueraDeServicio;
    }
}
