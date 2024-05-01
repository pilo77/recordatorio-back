package com.example.Recordatorio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.*;

@Entity
@Table(name="reminder")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reminder {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)  // La fecha no puede ser nula
    private LocalDate fecha;  // Día para el cual está programado el recordatorio

    @Column
    private LocalTime hora;  // Hora específica del recordatorio



}
