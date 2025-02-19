package com.example.demo.controller;

import com.example.demo.Homework;
import com.example.demo.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/homeworks")
public class HomeworkController {

    @Autowired
    private HomeworkService homeworkService;

    @GetMapping
    public List<Homework> getAllHomeworks() {
        return homeworkService.getAllHomeworks();
    }

    @GetMapping("/{id}")
    public Optional<Homework> getHomeworkById(@PathVariable Long id) {
        return homeworkService.getHomeworkById(id);
    }

    @PostMapping
    public Homework createHomework(@RequestBody Homework homework) {
        return homeworkService.saveHomework(homework);
    }

    @DeleteMapping("/{id}")
    public void deleteHomework(@PathVariable Long id) {
        homeworkService.deleteHomework(id);
    }
}
