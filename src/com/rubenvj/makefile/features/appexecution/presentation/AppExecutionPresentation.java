package com.rubenvj.makefile.features.appexecution.presentation;

import com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import com.rubenvj.makefile.features.appexecution.data.local.FileLocalDataSource;
import com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;
import com.rubenvj.makefile.features.appexecution.domain.IncrementAppOpenedUseCase;

public class AppExecutionPresentation {
    public static void appOpened() {
        IncrementAppOpenedUseCase incrementAppOpenedUseCase = new IncrementAppOpenedUseCase(AppExecutionDataRepository.newInstance());
        incrementAppOpenedUseCase.execute();
    }
}
