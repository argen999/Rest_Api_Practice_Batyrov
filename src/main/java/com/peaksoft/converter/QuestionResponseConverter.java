package com.peaksoft.converter;

import com.peaksoft.dto.response.QuestionResponse;
import com.peaksoft.model.entity.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionResponseConverter {

    public QuestionResponse create(Question question) {
        if (question == null) return null;
        QuestionResponse questionResponse = new QuestionResponse();
        questionResponse.setId(question.getId());
        questionResponse.setName(question.getName());
        questionResponse.setText(question.getText());
        questionResponse.setDuration(question.getDuration());
        questionResponse.setNumberOfRespondents(question.getNumberOfRespondents());
        questionResponse.setOptions(question.getOptions());
        return questionResponse;
    }

    public List<QuestionResponse> getAll(List<Question> questions) {
        List<QuestionResponse> questionResponses = new ArrayList<>();
        for (Question q : questions) {
            questionResponses.add(create(q));
        }
        return questionResponses;
    }

}
