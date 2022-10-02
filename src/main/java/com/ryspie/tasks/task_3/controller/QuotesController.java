package com.ryspie.tasks.task_3.controller;

import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;
import com.ryspie.tasks.task_3.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesController {
    private final QuotesService quotesService;

    @Autowired
    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/quotes")
    public KanyeWestQuote getQuote() {
        return quotesService.getQuote();
    }
}
