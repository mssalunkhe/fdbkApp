package com.webapp.fdbkrestful.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Address {

    String firstLine;
    String city;
    String state;
    String country;
    String pincode;

}
