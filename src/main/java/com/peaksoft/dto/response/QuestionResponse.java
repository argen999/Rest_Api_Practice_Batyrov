package com.peaksoft.dto.response;

import com.peaksoft.model.entity.Option;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionResponse {
    private Long id;
    private String name;
    private String text;
    private Integer duration;
    private Integer numberOfRespondents;
    private List<Option> options;
}
