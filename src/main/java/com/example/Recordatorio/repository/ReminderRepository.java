package com.example.Recordatorio.repository;

import com.example.Recordatorio.entity.Reminder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder,Long> {

}
//interactua directamente con la base de datos