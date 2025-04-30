package com.reejemplo.mascotas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reejemplo.mascotas.model.Mascota;
import com.reejemplo.mascotas.service.MascotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public String algo() {
        return "si";
    }

    @PostMapping
    public Mascota postMascota (@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);

    }
    
    
}
