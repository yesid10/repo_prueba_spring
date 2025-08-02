package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.model.Reserva;
import com.api.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar todas las reservas
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    //Mostrar una reserva por ID
    public Reserva getReservaById(Long id){
        return reservaRepository.findById(id).orElse(null);
    }

    //Crear un reserva
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Editar un reserva
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Eliminar un reserva
    public void deleteReserva(Long id){
        reservaRepository.deleteById(id);
    }
}
