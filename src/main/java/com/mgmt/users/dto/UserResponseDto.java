package com.mgmt.users.dto;

import com.mgmt.users.models.User;

public class UserResponseDto {
    private String name;
    private Integer age;
    private String email;

    public UserResponseDto(User user){
        this.name = user.getName();
        this.age = user.getAge();
        this.email = user.getEmail();
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}