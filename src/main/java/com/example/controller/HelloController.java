package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    MovieDaoImpl movieDao;

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        logger.info("Greeting controller");
        logger.info(String.valueOf(movieDao.findByDirector("tomasz")));
        return "greeting for quartz-hipster-entities project";
    }
}