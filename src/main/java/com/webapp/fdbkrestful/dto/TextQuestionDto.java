package com.webapp.fdbkrestful.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TextQuestionDto {
    protected int id;

    protected String text;
    protected LocalDateTime createdOn;

    protected LocalDateTime updatedOn;

    protected LocalDateTime deletedOn;
}
