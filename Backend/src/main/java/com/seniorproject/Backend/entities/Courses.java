package com.seniorproject.Backend.entities;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CoursesTable")
public class Courses {
    @Id
    @Column(name = "coursecode")
    private String coursecode;
    //@Id
    @Column(name = "section")
    private String section;
    //@Id
    @Column(name = "offsemester")
    private String offsemester;
    @Column(name = "coursename")
    private String coursename;
    @Column(name = "professor")
    private String professor;
    @Column(name = "description")
    private String description;
    @Column(name = "prereq")
    private String prereq;
    @Column(name = "days")
    private String days;
    @Column(name = "time")
    private int time;

    public Courses() {
    }

    public Courses(String coursecode, String section, String offsemester, String coursename, String porfessor, String description, String prereq, String days, int time) {
        this.coursecode = coursecode;
        this.section = section;
        this.offsemester = offsemester;
        this.coursename = coursename;
        this.professor = porfessor;
        this.description = description;
        this.prereq = prereq;
        this.days = days;
        this.time = time;
    }

    //getters and setters

    //CourseCode
    public String getCoursecode() {
        return coursecode;
    }
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    //Section
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }

    //Offered Semester
    public String getOffsemester() {
        return offsemester;
    }
    public void setOffsemester(String offsemester) {
        this.offsemester = offsemester;
    }

    //Course Name
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    //Professor
    public String getPorfessor() {
        return professor;
    }
    public void setPorfessor(String porfessor) {
        this.professor = porfessor;
    }

    //Description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Pre Reqs
    public String getPrereq() {
        return prereq;
    }
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    //Days
    public String getDays() {
        return days;
    }
    public void setDays(String days) {
        this.days = days;
    }

    //Time
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
}
