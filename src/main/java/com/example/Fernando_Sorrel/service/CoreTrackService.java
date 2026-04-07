package com.example.Fernando_Sorrel.service;

import com.example.Fernando_Sorrel.model.CoreTrack;
import com.example.Fernando_Sorrel.repository.CoreTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoreTrackService {
    @Autowired
    private CoreTrackRepository coreTrackRepository;

    public List readAll(){
        return coreTrackRepository.leerTodos();
    }
    public CoreTrack create(CoreTrack recurso){
        return coreTrackRepository.guardar(recurso);
    }
    public CoreTrack readById(int id){
        return coreTrackRepository.buscarPorId(id);
    }
    public CoreTrack updateRecurso(int id, CoreTrack recurso){
        return coreTrackRepository.modificarRecurso(id, recurso);
    }
    public boolean delete(int id){
        return coreTrackRepository.eliminarRecurso(id);
    }
}
