package com.example.inflearndesignpattern._03_behavioral_patterns._20_state._02_after;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 */
public class OnlineCourse {

    private State state = new Draft(this);

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void changeState(State state) {
        this.state = state;
    }
}
