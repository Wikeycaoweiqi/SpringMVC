package com.wikeystudyspringmvc.bean;

/**
 * @author: wikey
 * @create: 2024-06-30 00:14
 * @Description:
 */
public class User {
    private Long id;
    private String username;
    private Integer gender;
    private String email;

    public User() {
    }

    public User(Long id, String username, Integer gender, String email) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}