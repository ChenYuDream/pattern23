package com.chenyu;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * @author yu_chen
 * @create 2018-01-22 14:16
 **/
@Builder
public class Car {

    private String id;

    private String name;


    private @Singular Set<String> subjects;

}
