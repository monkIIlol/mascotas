package com.reejemplo.mascotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reejemplo.mascotas.model.Mascota;
import com.reejemplo.mascotas.repository.MascotaRepository;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public Mascota guardarMascota(Mascota mascota) {

        //System.out.println("Aquí se filtra la mascota");
        return mascotaRepository.create(mascota);
    }
}
