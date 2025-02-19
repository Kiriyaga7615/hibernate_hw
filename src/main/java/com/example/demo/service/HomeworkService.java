package com.example.demo.service;

import com.example.demo.Homework;
import com.example.demo.repository.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeworkService {

    @Autowired
    private HomeworkRepository homeworkRepository;

    public List<Homework> getAllHomeworks() {
        return homeworkRepository.findAll();
    }

    public Optional<Homework> getHomeworkById(Long id) {
        return homeworkRepository.findById(id);
    }

    public Homework saveHomework(Homework homework) {
        return homeworkRepository.save(homework);
    }

    public void deleteHomework(Long id) {
        homeworkRepository.deleteById(id);
    }
}
