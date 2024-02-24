package main.com.rubenvj.makefile.features.welcome.presentation;

import main.com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import main.com.rubenvj.makefile.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {
    public static void welcomeMessage() {
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(AppExecutionDataRepository.newInstance());
        boolean isFirstTime = showWelcomeMessageUseCase.execute();
        if (isFirstTime) {
            System.out.println("Es la primera vez que entras en la app");
        }
    }
}
