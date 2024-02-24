package main.com.rubenvj.makefile.features.appexecution.presentation;

import main.com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import main.com.rubenvj.makefile.features.appexecution.domain.IncrementAppOpenedUseCase;

public class AppExecutionPresentation {
    public static void appOpened() {
        IncrementAppOpenedUseCase incrementAppOpenedUseCase = new IncrementAppOpenedUseCase(AppExecutionDataRepository.newInstance());
        incrementAppOpenedUseCase.execute();
    }
}
