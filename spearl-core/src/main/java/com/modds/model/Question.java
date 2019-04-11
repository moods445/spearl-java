package com.modds.model;

import javax.persistence.Entity;

@Entity
public class Question extends BaseEntity<Question>{

    private String question;
    private String refAnswer;

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getRefAnswer() {
        return refAnswer;
    }

    public Question setRefAnswer(String refAnswer) {
        this.refAnswer = refAnswer;
        return this;
    }
}
