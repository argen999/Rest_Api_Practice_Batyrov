package com.peaksoft.converter;

import com.peaksoft.dto.request.QuestionRequest;
import com.peaksoft.model.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionRequestConverter {

    public Question create(QuestionRequest questionRequest) {
        if (questionRequest == null) return null;
        Question question = new Question();
        question.setName(questionRequest.getName());
        question.setText(questionRequest.getText());
        question.setDuration(questionRequest.getDuration());
        question.setNumberOfRespondents(questionRequest.getNumberOfRespondents());
        question.setOptions(questionRequest.getOptions());
        return question;
    }

    public void update(Question question, QuestionRequest questionRequest) {
        question.setName(questionRequest.getName());
        question.setText(questionRequest.getText());
        question.setDuration(questionRequest.getDuration());
        question.setNumberOfRespondents(questionRequest.getNumberOfRespondents());
        question.setOptions(questionRequest.getOptions());
    }

}
