package main.com.rubenvj.makefile.features.vote.presentation;

import main.com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import main.com.rubenvj.makefile.features.vote.domain.ShowVoteAppMessageUseCase;

public class VotePresentation {
    public static void showVoteMessage() {
        ShowVoteAppMessageUseCase showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(AppExecutionDataRepository.newInstance());
        boolean isFiveOrMore = showVoteAppMessageUseCase.execute();
        if (isFiveOrMore) {
            System.out.println("Vote nuestra app, por favor.");
        }
    }
}
