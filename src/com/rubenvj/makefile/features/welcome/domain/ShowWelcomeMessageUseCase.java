package com.rubenvj.makefile.features.welcome.domain;

import com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class ShowWelcomeMessageUseCase {
    private AppExecutionRepository appExecutionRepository;
    public ShowWelcomeMessageUseCase (AppExecutionRepository appExecutionRepository) {
        this.appExecutionRepository = appExecutionRepository;
    }

    public boolean execute() {
        AppExecution appExecution = appExecutionRepository.getAppExecution();
        return appExecution != null && appExecution.countTimeOpened == 0;
    }
}
