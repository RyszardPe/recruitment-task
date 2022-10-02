package com.ryspie.tasks.task_3.webClient;

import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KanyeWestQuoteClient {
    public static final String KANYE_WEST_QUOTE_URL = "https://api.kanye.rest";
    private final RestTemplate restTemplate = new RestTemplate();


    public KanyeWestQuote getKanyeWestQuote() {
        KanyeWestQuote kanyeWestQuote = restTemplate.getForObject(KANYE_WEST_QUOTE_URL, KanyeWestQuote.class);
        return kanyeWestQuote;
    }
}