package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Course;
import com.webapp.fdbkrestful.entity.Feedback;
import com.webapp.fdbkrestful.entity.TextQuestion;
import com.webapp.fdbkrestful.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private long id;

    private UserDto giverDto;

    private UserDto takerDto;

    private TextQuestionDto questionDto;

    private CourseDto courseDto;//required in academic feedback only

    private String textResponse;//relevant in text questions

    private float mcqResponse;//relevant in Mcq questions

}
