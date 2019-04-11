package com.modds.service;

import com.modds.dao.QuestionDao;
import com.modds.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionDao questionDao;


    public Question save(Question question) {

        Question tobeSaved = questionDao.getOne(question.getId());
        if (tobeSaved == null) {
            question.setCreateDefault();
            tobeSaved = question;
        } else {
            tobeSaved.setQuestion(question.getQuestion());
            tobeSaved.setRefAnswer(question.getRefAnswer());
        }
        return questionDao.save(tobeSaved);
    }

    public List<Question> get() {
        return questionDao.findAll();
    }
}
