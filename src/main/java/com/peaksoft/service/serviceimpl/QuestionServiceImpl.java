package com.peaksoft.service.serviceimpl;

import com.peaksoft.converter.QuestionRequestConverter;
import com.peaksoft.converter.QuestionResponseConverter;
import com.peaksoft.dto.request.QuestionRequest;
import com.peaksoft.dto.response.QuestionResponse;
import com.peaksoft.model.entity.Question;
import com.peaksoft.repository.QuestionRepository;
import com.peaksoft.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionRequestConverter questionRequestConverter;
    private final QuestionResponseConverter questionResponseConverter;

    @Override
    public List<QuestionResponse> getAllQuestion() {
        return questionResponseConverter.getAll(questionRepository.findAll());
    }

    @Override
    public QuestionResponse getQuestionById(Long id) {
        Question question = questionRepository.findById(id).get();
        return questionResponseConverter.create(question);
    }

    @Override
    public QuestionResponse saveQuestion(QuestionRequest questionRequest) {
        Question question = questionRequestConverter.create(questionRequest);
        questionRepository.save(question);
        return questionResponseConverter.create(question);
    }

    @Override
    public QuestionResponse updateQuestionById(Long id, QuestionRequest questionRequest) {
        Question question = questionRepository.findById(id).get();
        questionRequestConverter.update(question, questionRequest);
        return questionResponseConverter.create(questionRepository.save(question));
    }

    @Override
    public QuestionResponse deleteQuestionById(Long id) {
        Question question = questionRepository.findById(id).get();
        questionRepository.delete(question);
        return questionResponseConverter.create(question);
    }
}
