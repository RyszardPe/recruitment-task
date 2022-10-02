package com.ryspie.tasks.task_3.repository;

import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;

public interface KanyeWestQuoteRepository {
    void saveQuote(KanyeWestQuote kanyeWestQuote);

    void showQuotes();
}
