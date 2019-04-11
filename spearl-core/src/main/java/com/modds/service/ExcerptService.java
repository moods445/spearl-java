package com.modds.service;

import com.modds.dao.ExcerptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcerptService {

    @Autowired
    private ExcerptDao excerptDao;


}
