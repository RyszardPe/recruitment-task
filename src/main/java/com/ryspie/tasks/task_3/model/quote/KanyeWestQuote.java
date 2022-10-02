package com.ryspie.tasks.task_3.model.quote;

import java.util.Objects;

public class KanyeWestQuote {
    private String quote;

    public KanyeWestQuote() {
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KanyeWestQuote)) return false;
        KanyeWestQuote that = (KanyeWestQuote) o;
        return Objects.equals(quote, that.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quote);
    }
}
