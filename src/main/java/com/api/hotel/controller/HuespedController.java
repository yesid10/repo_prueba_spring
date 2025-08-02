package com.api.hotel.controller;

import com.api.hotel.model.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    //GET
    @GetMapping("/list")
    public List<Huesped> listAll(){
        return huespedService.getAllHuespedes();
    }

    //GET por ID
    @GetMapping("list/{id}")
    public Huesped listById(@PathVariable Long id){
        return huespedService.getHuespedById(id);
    }

    //POST
    @PostMapping("/create")
    public Huesped createHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    //PUT
    @PutMapping("update/{id}")
    public Huesped updateHuesped(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    //DELETE
    @DeleteMapping("delete/{id}")
    public void deleteHuesped(@PathVariable Long id){
        huespedService.deleteHuesped(id);
    }
}
