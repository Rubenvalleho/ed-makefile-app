package com.rubenvj.makefile.features.welcome.presentation;

import com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import com.rubenvj.makefile.features.appexecution.data.local.FileLocalDataSource;
import com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import com.rubenvj.makefile.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {
    public static void welcomeMessage() {
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(AppExecutionDataRepository.newInstance());
        boolean isFirstTime = showWelcomeMessageUseCase.execute();
        if (isFirstTime) {
            System.out.println("Es la primera vez que entras en la app");
        }
    }
}
