package com.example.Recordatorio.service.impl;

import com.example.Recordatorio.entity.Reminder;
import com.example.Recordatorio.repository.ReminderRepository;
import com.example.Recordatorio.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderServiceimpl implements ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    @Override
    public List<Reminder> findAll() {
        return reminderRepository.findAll();
    }

    @Override
    public Optional<Reminder> getId(Long id) {
        return reminderRepository.findById(id);

    }

    @Override
    public Reminder save(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    @Override
    public void update(Reminder reminder, Long id) {

        //Reminder r = remimderRepository.findById(id).orElse(null);
        Optional<Reminder> r = reminderRepository.findById(id);
        if (!r.isEmpty()) {
            Reminder reminderUpdate=r.get();
            reminderUpdate.setTitle(reminder.getTitle());
            reminderUpdate.setDescription(reminder.getDescription());
            reminderUpdate.setFecha(reminder.getFecha());
            reminderUpdate.setHora(reminder.getHora());
        }else{
            System.out.println("No existe el miembro");
        }

    }

    @Override
    public void delete(Long id) {
        reminderRepository.deleteById(id);

    }
}
