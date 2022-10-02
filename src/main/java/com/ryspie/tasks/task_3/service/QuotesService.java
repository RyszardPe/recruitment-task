package com.ryspie.tasks.task_3.service;

import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;
import com.ryspie.tasks.task_3.webClient.KanyeWestQuoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotesService {
    private final KanyeWestQuoteClient kanyeWestQuoteClient;

    @Autowired
    public QuotesService(KanyeWestQuoteClient kanyeWestQuoteClient) {
        this.kanyeWestQuoteClient = kanyeWestQuoteClient;
    }

    public KanyeWestQuote getQuote() {
        return kanyeWestQuoteClient.getKanyeWestQuote();
    }
}
