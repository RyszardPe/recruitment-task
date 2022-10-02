package com.ryspie.tasks.task_3;

import com.ryspie.tasks.task_3.messagesProvider.MainLoopCommand;
import com.ryspie.tasks.task_3.messagesProvider.MainLoopCommandComparator;
import com.ryspie.tasks.task_3.messagesProvider.MainLoopMessageForUser;
import com.ryspie.tasks.task_3.model.quote.KanyeWestQuote;
import com.ryspie.tasks.task_3.repository.KanyeWestQuoteRepository;
import com.ryspie.tasks.task_3.service.QuotesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandLineAppStartRunner implements CommandLineRunner {
    static Scanner scanner = new Scanner(System.in);
    private final KanyeWestQuoteRepository kanyeWestQuoteRepository;
    private final QuotesService kanyeWestQuoteService;

    public CommandLineAppStartRunner(KanyeWestQuoteRepository kanyeWestQuoteRepository, QuotesService kanyeWestQuoteService) {
        this.kanyeWestQuoteRepository = kanyeWestQuoteRepository;
        this.kanyeWestQuoteService = kanyeWestQuoteService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(MainLoopMessageForUser.INITIAL_MESSAGE_FOR_USER);
        boolean isRunning = true;
        while (isRunning) {
            String userCommand = scanner.nextLine();
            if (MainLoopCommandComparator.compareCommands(userCommand, MainLoopCommand.NEXT)) {
                KanyeWestQuote quote = kanyeWestQuoteService.getQuote();
                kanyeWestQuoteRepository.saveQuote(quote);
            } else if (MainLoopCommandComparator.compareCommands(userCommand, MainLoopCommand.SHOW)) {
                kanyeWestQuoteRepository.showQuotes();
            } else {
                isRunning = false;
                System.out.println(MainLoopMessageForUser.EXIT_MESSAGE_FOR_USER);
                scanner.close();
            }
        }
    }
}
