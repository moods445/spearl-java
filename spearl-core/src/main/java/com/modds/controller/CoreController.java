package com.modds.controller;

import com.modds.common.Result;
import com.modds.model.Question;
import com.modds.model.converter.QuestionDtoConverter;
import com.modds.model.dto.QuestionDto;
import com.modds.service.ExcerptService;
import com.modds.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.stream.Collectors;

@RestController
public class CoreController {

    @Autowired
    private ExcerptService excerptService;

    @Autowired
    private QuestionService questionService;


    @PutMapping("/questions")
    public Result addQuestion(@Valid @RequestBody QuestionDto questionAddDto) {
        Question question = QuestionDtoConverter.instance().convert(questionAddDto);
        questionService.save(question);
        return Result.success();
    }

    @GetMapping("/questions")
    public Result getQuestion() {
        QuestionDtoConverter converter = QuestionDtoConverter.instance();
        return Result.success(questionService.get().stream().map(converter.reverse()::convert).collect(Collectors.toList()));
    }
}

