package com.avalith.GonzaloChallenge.controller;

import com.avalith.GonzaloChallenge.model.Cliente;
import com.avalith.GonzaloChallenge.model.Habitacion;
import com.avalith.GonzaloChallenge.repository.ClienteRepository;
import com.avalith.GonzaloChallenge.repository.HabitacionRepository;
import com.avalith.GonzaloChallenge.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HabitacionController {

    private final Service habitacion;
    private final HabitacionRepository habitacionRepository;
    private final Service cliente;
    private final ClienteRepository clienteRepository;


    @PostMapping("/generarHabitaciones")
    public void generarhabitaciones(){
        habitacion.generarHabitaciones();
    }

    @GetMapping("/listado-alquiler")
    public List<Cliente> verClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/listado-habitaciones-alquiladas")
    public List<Habitacion> verHabitaciones(){
        return habitacionRepository.findAll();
    }

    @PostMapping("/alta")
    public void darAlta(){
        cliente.darDeAlta();
    }

    @PutMapping("/estado-habitaciones/{id}")
    public void modificarEstadoHabitaciones(@PathVariable("id") Integer id, @RequestBody Habitacion h){
        Habitacion hayHab;
        Optional<Habitacion> habitacion = habitacionRepository.findById(id);
        if(habitacion.isPresent()){
            hayHab = habitacion.get();
            hayHab.setDisponible(h.isDisponible());
            hayHab.setFueraDeServicio(h.isFueraDeServicio());
            hayHab.setEnLimpieza(h.isEnLimpieza());

            habitacionRepository.save(hayHab);
        }

    }

    @PutMapping("/modificar/{id}")
    public void modificarHabitaciones(@PathVariable("id") Integer id, @RequestBody Habitacion h){
        Habitacion hayHab;
        Optional<Habitacion> habitacion = habitacionRepository.findById(id);
        if(habitacion.isPresent()){
            hayHab = habitacion.get();
            hayHab.setCantCamas(h.getCantCamas());
            hayHab.setCantPersonas(h.getCantPersonas());
            hayHab.setServicios(h.getServicios());
            hayHab.setPrecio(h.getPrecio());
            hayHab.setDisponible(h.isDisponible());
            hayHab.setFueraDeServicio(h.isFueraDeServicio());
            hayHab.setEnLimpieza(h.isEnLimpieza());

            habitacionRepository.save(hayHab);
        }
    }

    @PutMapping("modificar-cliente/{id}")
    public void modificarCliente(@PathVariable("id") Integer id, @RequestBody Cliente c){
        Cliente hayCli;
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()){
            hayCli = cliente.get();
            hayCli.setApellido(c.getApellido());
            hayCli.setNombre(c.getNombre());
            hayCli.setCantDias(c.getCantDias());
            hayCli.setCiudadDeOrigen(c.getCiudadDeOrigen());
            hayCli.setNumHabitacion(c.getNumHabitacion());
            clienteRepository.save(hayCli);

        }
    }


    @DeleteMapping("/baja/{id}")
    public void bajaHabitacion(@PathVariable("id") Integer id){
        Habitacion hayHab;
        Optional<Habitacion> habitacion = habitacionRepository.findById(id);
        if(habitacion.isPresent()){
            hayHab = habitacion.get();
            habitacionRepository.delete(hayHab);
        }
    }


}