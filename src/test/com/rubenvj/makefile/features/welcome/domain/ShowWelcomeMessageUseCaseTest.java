package test.com.rubenvj.makefile.features.welcome.domain;

import main.com.rubenvj.makefile.features.appexecution.data.AppExecutionDataRepository;
import main.com.rubenvj.makefile.features.appexecution.data.local.FileLocalDataSource;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.welcome.domain.ShowWelcomeMessageUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShowWelcomeMessageUseCaseTest {

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearsDown() {

    }

    @Test
    public void cuandoEsNullNoMuestraElMensaje() {
        AppExecution appExecution = null;
        AppExecutionDataRepository appExecutionDataRepository = new AppExecutionDataRepository(new FileLocalDataSource());
        appExecutionDataRepository.saveAppExecution(appExecution);
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(appExecutionDataRepository);
        boolean isNull = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(isNull);
    }

    @Test
    public void cuandoEsDistintoACeroNoMuestraElMensaje() {
        AppExecution appExecution = new AppExecution(1);
        AppExecutionDataRepository appExecutionDataRepository = new AppExecutionDataRepository(new FileLocalDataSource());
        appExecutionDataRepository.saveAppExecution(appExecution);
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(appExecutionDataRepository);
        boolean isNonZero = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(isNonZero);
    }

    public void cuandoEsCeroMuestroElMensaje() {
        AppExecution appExecution = new AppExecution(0);
        AppExecutionDataRepository appExecutionDataRepository = new AppExecutionDataRepository(new FileLocalDataSource());
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(appExecutionDataRepository);
        boolean isZero = showWelcomeMessageUseCase.execute();

        Assertions.assertTrue(isZero);
    }


}
