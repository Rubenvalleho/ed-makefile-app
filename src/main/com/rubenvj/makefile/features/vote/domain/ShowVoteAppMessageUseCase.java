package main.com.rubenvj.makefile.features.vote.domain;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class ShowVoteAppMessageUseCase {
    private AppExecutionRepository appExecutionRepository;
    private int totalOpened = 5;
    public ShowVoteAppMessageUseCase (AppExecutionRepository appExecutionRepository) {
        this.appExecutionRepository = appExecutionRepository;
    }

    public boolean execute() {
        AppExecution appExecution = appExecutionRepository.getAppExecution();
        return appExecution != null && appExecution.countTimeOpened == totalOpened;
    }
}
