package com.rubenvj.makefile.features.vote.presentation;

import com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import com.rubenvj.makefile.features.vote.domain.ShowVoteAppMessageUseCase;

public class VotePresentation {
    public static void voteAppMessage() {
        ShowVoteAppMessageUseCase showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(AppExecutionDataRepository.newInstance());
        boolean isTotalOpened = showVoteAppMessageUseCase.execute();
        if (isTotalOpened) {
            System.out.println("Vote nuestra aplicacion, por favor.");
        }
    }
}
