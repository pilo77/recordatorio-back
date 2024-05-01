package com.example.Recordatorio.controller;

import com.example.Recordatorio.entity.Reminder;
import com.example.Recordatorio.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/reminder")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @GetMapping("/reminder")
    public List<Reminder> findAll() {
        return reminderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Reminder> findById(@PathVariable Long id) {
        return reminderService.findById(id);
    }

    @PostMapping("/save")
    public Reminder save(@RequestBody Reminder reminder) {
        return reminderService.save(reminder);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Reminder reminder,@PathVariable Long id){
        reminderService.update(reminder, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@RequestParam Long id){
        reminderService.delete(id);
    }





}
