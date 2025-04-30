package com.reejemplo.mascotas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reejemplo.mascotas.model.Mascota;

@Repository
public class MascotaRepository {
    List<Mascota> pets = new ArrayList<>();

    public Mascota create(Mascota mascota) {
        pets.add(mascota);
        return mascota;
    }
}
