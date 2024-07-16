package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.ResponseDto;
import com.webapp.fdbkrestful.entity.Response;

public class ResponseMapper {
    public static ResponseDto mapToResponseDto(Response response) {
        return new ResponseDto(response.getId(),  UserMapper.mapToUserDto(response.getGiver()),
                UserMapper.mapToUserDto(response.getTaker()), TextQuestionMapper.mapToTextQuestionDto(response.getQuestion()), CourseMapper.mapToCourseDto(response.getCourse()), response.getTextResponse(), response.getMcqResponse());
    }

    public static Response mapToResponse(ResponseDto responseDto) {
        return new Response(responseDto.getId(),  UserMapper.mapToUser(responseDto.getGiverDto()), UserMapper.mapToUser(responseDto.getTakerDto()),
                TextQuestionMapper.mapToTextQuestion(responseDto.getQuestionDto()), CourseMapper.mapToCourse(responseDto.getCourseDto()),responseDto.getTextResponse(), responseDto.getMcqResponse());
    }
}
