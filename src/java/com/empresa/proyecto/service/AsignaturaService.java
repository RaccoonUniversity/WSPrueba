package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class AsignaturaService {

    List<Asignatura> listaAsignaturas = new ArrayList<>();

    public AsignaturaService() {
    }

    public String crearAsignatura(String nombreAsignatura) {
        Asignatura a = new Asignatura();
        a.setIdAsignatura(1 + listaAsignaturas.size());
        a.setNombreAsignatura(nombreAsignatura);
        listaAsignaturas.add(a);
        return "Se ha agregado " + a.getNombreAsignatura();
    }

    public List<Asignatura> listarAsignaturas() {
        return listaAsignaturas;
    }

}
