package com.modds.model.converter;

import com.google.common.base.Converter;
import com.modds.model.Question;
import com.modds.model.dto.QuestionDto;

public class QuestionDtoConverter extends Converter<QuestionDto, Question> {
    private static final QuestionDtoConverter INSTANCE = new QuestionDtoConverter();

    private QuestionDtoConverter() {
    }

    public static QuestionDtoConverter instance() {
        return INSTANCE;
    }

    @Override
    protected Question doForward(QuestionDto questionDto) {
        Question question = new Question();
        question.setQuestion(questionDto.getQuestion());
        question.setRefAnswer(questionDto.getRefAnswer());
        question.setId(questionDto.getId());
        return question;
    }

    @Override
    protected QuestionDto doBackward(Question question) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setQuestion(question.getQuestion());
        questionDto.setRefAnswer(question.getRefAnswer());
        return questionDto;
    }
}
