package com.peaksoft.service;

import com.peaksoft.dto.request.QuestionRequest;
import com.peaksoft.dto.response.QuestionResponse;

import java.util.List;

public interface QuestionService {
    List<QuestionResponse> getAllQuestion();
    QuestionResponse getQuestionById(Long id);
    QuestionResponse saveQuestion(QuestionRequest questionRequest);
    QuestionResponse updateQuestionById(Long id, QuestionRequest questionRequest);
    QuestionResponse deleteQuestionById(Long id);
}
