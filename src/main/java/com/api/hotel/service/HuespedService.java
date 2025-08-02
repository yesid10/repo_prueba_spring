package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //Mostrar todos los huespedes
    public List<Huesped> getAllHuespedes() {
        return huespedRepository.findAll();
    }

    //Mostrar un huesped por ID
    public Huesped getHuespedById(Long id){
        return huespedRepository.findById(id).orElse(null);
    }

    //Crear un huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Editar un Huesped
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Eliminar un huesped
    public void deleteHuesped(Long id){
        huespedRepository.deleteById(id);
    }
}
