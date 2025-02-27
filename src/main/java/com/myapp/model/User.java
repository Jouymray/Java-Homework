package com.myapp.model;

public class User {
    private int id;
    private String email;
    private String password;
    private String birthday;
    private String newStudent;
    private String college;
    private String major;
    private String color;
    private String terms;  // "yes" or "no"

    public User() {}

    public User(String email, String password, String birthday, String newStudent,
                String college, String major, String color, String terms) {
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.newStudent = newStudent;
        this.college = college;
        this.major = major;
        this.color = color;
        this.terms = terms;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getNewStudent() { return newStudent; }
    public void setNewStudent(String newStudent) { this.newStudent = newStudent; }

    public String getCollege() { return college; }
    public void setCollege(String college) { this.college = college; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTerms() { return terms; }
    public void setTerms(String terms) { this.terms = terms; }
}
