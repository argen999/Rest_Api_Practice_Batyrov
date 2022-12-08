package com.peaksoft.controller;

import com.peaksoft.dto.request.QuestionRequest;
import com.peaksoft.dto.response.QuestionResponse;
import com.peaksoft.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/getAllQuestion")
    public List<QuestionResponse> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @GetMapping("/getQuestionById/{id}")
    public QuestionResponse getQuestionById(@PathVariable Long id){
        return questionService.getQuestionById(id);
    }

    @PostMapping("/saveQuestion")
    public QuestionResponse saveQuestion(@RequestBody QuestionRequest questionRequest) {
        return questionService.saveQuestion(questionRequest);
    }

    @PutMapping("/updateQuestion/{id}")
    public QuestionResponse updateQuestion(@PathVariable Long id, @RequestBody QuestionRequest questionRequest) {
        return questionService.updateQuestionById(id, questionRequest);
    }

    @DeleteMapping("/deleteQuestionById/{id}")
    public QuestionResponse deleteQuestionById(@PathVariable Long id) {
        return questionService.deleteQuestionById(id);
    }

}
