package main.com.rubenvj.makefile.features.welcome.presentation;

import main.com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import main.com.rubenvj.makefile.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {
    public static void showWelcomeMessage() {
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(AppExecutionDataRepository.newInstance());
        boolean isCero = showWelcomeMessageUseCase.execute();
        if (isCero) {
            System.out.println("Es tu primera vez");
        }
    }
}
