package com.webapp.fdbkrestful.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor


public class McqDto extends TextQuestionDto {
    private Map<String, Double> options;
    private float answer;
}
