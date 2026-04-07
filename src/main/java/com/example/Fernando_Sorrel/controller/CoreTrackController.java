package com.example.Fernando_Sorrel.controller;

import com.example.Fernando_Sorrel.model.CoreTrack;
import com.example.Fernando_Sorrel.service.CoreTrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@RestController
@RequestMapping("api/v1/recursos")
public class CoreTrackController {

    @Autowired
    private CoreTrackService coreTrackService;

    @GetMapping
    public List getRecursos(){
        return coreTrackService.readAll();
    }
    @PostMapping
    public CoreTrack postReacurso(@RequestBody CoreTrack recurso){
        return coreTrackService.create(recurso);
    }
    @GetMapping("{id}")
    public CoreTrack getRecursoPorId(@PathVariable int id){
        return coreTrackService.readById(id);
    }
    @PutMapping("{id}")
    public CoreTrack putRecurso(@PathVariable int id, @RequestBody CoreTrack recurso){
        return coreTrackService.updateRecurso(id, recurso);
    }
    @DeleteMapping("eliminar/{id}")
    public String deleteRecurso(@PathVariable int id){
        if (coreTrackService.delete(id)){
            return "Recurso eliminado";
        }
        return "No fue posible eliminar";
    }
}
