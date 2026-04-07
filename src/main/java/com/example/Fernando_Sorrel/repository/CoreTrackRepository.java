package com.example.Fernando_Sorrel.repository;

import com.example.Fernando_Sorrel.model.CoreTrack;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CoreTrackRepository {
    private List<CoreTrack> listaRecursos = new ArrayList<>();

    public List leerTodos(){
        return listaRecursos;
    }

    public CoreTrack guardar(CoreTrack recurso){
        listaRecursos.add(recurso);
        return recurso;
    }
    public CoreTrack buscarPorId(int id){
        for (CoreTrack recurso : listaRecursos){
            if (recurso.getId() == id){
                return recurso;
            }
        }
        return null;
    }
    public CoreTrack modificarRecurso(int id, CoreTrack recurso){
        CoreTrack recursoBuscado = buscarPorId(id);
        if (recursoBuscado != null){
            recursoBuscado.setNombre(recurso.getNombre());
            recursoBuscado.setDescripcion(recurso.getDescripcion());
            recursoBuscado.setTipo(recurso.getTipo());
            recursoBuscado.setCantidad(recurso.getCantidad());
            recursoBuscado.setDisponible(recurso.isDisponible());
            recursoBuscado.setResponsable(recurso.getResponsable());
            recursoBuscado.setFechaCreacion(recurso.getFechaCreacion());
            return recursoBuscado;
        }
        return null;
    }
    public boolean eliminarRecurso(int id){
        return listaRecursos.removeIf(r -> r.getId()==id);
    }
}

