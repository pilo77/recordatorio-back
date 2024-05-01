package com.example.Recordatorio.service;

import com.example.Recordatorio.entity.Reminder;

import java.util.List;
import java.util.Optional;

public interface ReminderService {
    List<Reminder> findAll();

    Optional<Reminder> getId(Long id);

    Reminder save(Reminder reminder);

    void update(Reminder reminder, Long id);

    void delete(Long id);


}
