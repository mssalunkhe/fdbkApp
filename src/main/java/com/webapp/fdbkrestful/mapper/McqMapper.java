package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.McqDto;
import com.webapp.fdbkrestful.entity.Mcq;

public class McqMapper extends TextQuestionMapper {
    public static McqDto mapToMcqDto(Mcq mcq) {
        return McqDto.builder().id(mcq.getId())
                .text(mcq.getText())
                .options(mcq.getOptions())
                .build();
        // return new McqDto(  mcq.getType(),mcq.getInstitute());//,mcq.getEmail(),mcq.getAddress(),mcq.getDateOfBirth(),mcq.getMobile());


    }

    public static Mcq mapToMcq(McqDto mcqDto) {
        return Mcq.builder().id(mcqDto.getId())
                .text(mcqDto.getText())
                .options(mcqDto.getOptions())
                .build();
    }
}
