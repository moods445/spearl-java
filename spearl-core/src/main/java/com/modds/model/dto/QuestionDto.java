package com.modds.model.dto;


import org.hibernate.validator.constraints.NotBlank;

public class QuestionDto {

    private Long id;
    @NotBlank
    private String question;
    private String refAnswer;

    public String getQuestion() {
        return question;
    }

    public QuestionDto setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getRefAnswer() {
        return refAnswer;
    }

    public QuestionDto setRefAnswer(String refAnswer) {
        this.refAnswer = refAnswer;
        return this;
    }

    public Long getId() {
        return id;
    }

    public QuestionDto setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "QuestionAddDto{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", refAnswer='" + refAnswer + '\'' +
                '}';
    }
}
