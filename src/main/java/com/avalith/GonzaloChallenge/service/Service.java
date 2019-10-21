package com.avalith.GonzaloChallenge.service;


import com.avalith.GonzaloChallenge.model.Cliente;
import com.avalith.GonzaloChallenge.model.Habitacion;
import com.avalith.GonzaloChallenge.repository.ClienteRepository;
import com.avalith.GonzaloChallenge.repository.HabitacionRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final HabitacionRepository habitacionRepository;
    private final ClienteRepository clienteRepository;

    public List<Habitacion> generarHabitaciones(){
        List<Habitacion> habitaciones = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Habitacion h = new Habitacion(i,1,2,"full",1200,true,false,false);
            habitaciones.add(h);
        }
        return habitaciones;
    }


    public void darDeAlta(){
        Habitacion habitacion = new Habitacion();
        Cliente cliente = new Cliente();

        habitacion.setId(4);
        habitacion.setCantCamas(1);
        habitacion.setCantPersonas(1);
        habitacion.setPrecio(1000);
        habitacion.setServicios("desayuno");
        habitacion.setDisponible(false);

        //Saving data in DB
        habitacionRepository.save(habitacion);

        cliente.setId(1);
        cliente.setDni(123);
        cliente.setApellido("Grillo");
        cliente.setNombre("Pepe");
        cliente.setCelular("11459873");
        cliente.setCiudadDeOrigen("Córdoba");
        cliente.setCantDias(2);
        cliente.setNumHabitacion(habitacion);

        //Saving data in DB
        clienteRepository.save(cliente);

    }

}
