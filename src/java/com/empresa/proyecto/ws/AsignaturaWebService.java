/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.Asignatura;
import com.empresa.proyecto.service.AsignaturaService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crist
 */
@WebService(serviceName = "AsignaturaWebService")
public class AsignaturaWebService {

    AsignaturaService a = new AsignaturaService();
    
    /**
     *
     * @param nombreAsignatura
     * @return
     */
    @WebMethod(operationName = "crearAsignaturas")
    public String crearAsignaturas(@WebParam(name = "nombreAsignatura") String nombreAsignatura) {
        return a.crearAsignatura(nombreAsignatura);
    }
    
    /**
     *
     * @return
     */
    @WebMethod(operationName = "listarAsignaturas")
    public List<Asignatura> listarAsignaturas() {
        return a.listarAsignaturas();
    }
}
