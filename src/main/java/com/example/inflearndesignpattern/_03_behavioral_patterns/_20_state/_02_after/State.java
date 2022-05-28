package com.example.inflearndesignpattern._03_behavioral_patterns._20_state._02_after;

/**
 * State
 */
public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
