package com.webapp.fdbkrestful.dto;


import com.webapp.fdbkrestful.entity.Questionnaire;
import com.webapp.fdbkrestful.entity.User;
import com.webapp.fdbkrestful.utility.FacilityType;
import com.webapp.fdbkrestful.utility.Semester;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackDto {
    private int id;

    private String title;

    private Date startDate;

    private Date endDate;

    private String academicYear;

    private Semester semester;

    private FacilityType onFacility;

    private Set<UserDto> givers;

    private Set<UserDto> takers;

    private QuestionnaireDto questionnaireDto;

    private String description;
    private Set<ResponseDto> responses;
}
