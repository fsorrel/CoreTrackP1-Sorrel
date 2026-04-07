package com.example.Fernando_Sorrel.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoreTrack {
    private Long id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private boolean disponible;
    private int cantidad;
    private String responsable;
    private LocalDate fechaCreacion;
}
