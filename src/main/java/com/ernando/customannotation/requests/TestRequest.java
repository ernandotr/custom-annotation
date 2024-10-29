package com.ernando.customannotation.requests;

import com.ernando.customannotation.annotations.NameValidate;

public class TestRequest {

    @NameValidate
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
