package com.aluracursos.desafioAldo.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
