package com.rubenvj.makefile.features.appexecution.domain;

public class IncrementAppOpenedUseCase {
    private AppExecutionRepository appExecutionRepository;
    public IncrementAppOpenedUseCase (AppExecutionRepository appExecutionRepository) {
        this.appExecutionRepository = appExecutionRepository;
    }
    public void execute () {
        AppExecution appExecution = appExecutionRepository.getAppExecution();
        if (appExecution == null) {
            appExecution = new AppExecution(0);
        } else {
            appExecution = new AppExecution(appExecution.countTimeOpened + 1);
        }
        appExecutionRepository.saveAppExecution(appExecution);
    }
}
