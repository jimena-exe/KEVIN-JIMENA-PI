package com.example.paciente.service;

import com.example.paciente.entity.Odontologo;

import java.util.Optional;

public interface IOdontologoService {
    Odontologo guardarOdontologo(Odontologo odontologo);

    Optional<Odontologo> buscarPorId(Integer id);
}
