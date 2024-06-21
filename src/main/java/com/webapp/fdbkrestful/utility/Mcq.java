package com.webapp.fdbkrestful.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class Mcq extends Question {
    private HashMap<String, Float> options;
    private HashMap<String, Float> response;
}
