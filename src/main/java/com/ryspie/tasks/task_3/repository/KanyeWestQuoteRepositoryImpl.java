package com.ryspie.tasks.task_3.repository;

import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;

import java.util.HashSet;
import java.util.Set;

public class KanyeWestQuoteRepositoryImpl implements KanyeWestQuoteRepository {
    private final Set<KanyeWestQuote> kanyeWestQuoteSet;

    public KanyeWestQuoteRepositoryImpl() {
        kanyeWestQuoteSet = new HashSet<>();
    }

    @Override
    public void saveQuote(KanyeWestQuote kanyeWestQuote) {
        if (kanyeWestQuoteSet.contains(kanyeWestQuote)) {
            System.err.println("Quote: " + kanyeWestQuote.getQuote() + " - already exist");
        } else {
            kanyeWestQuoteSet.add(kanyeWestQuote);
            System.out.println(kanyeWestQuote.getQuote());
        }
    }

    @Override
    public void showQuotes() {
        for (KanyeWestQuote kanyeWestQuote : kanyeWestQuoteSet) {
            System.out.println(kanyeWestQuote.getQuote());
        }
    }
}
