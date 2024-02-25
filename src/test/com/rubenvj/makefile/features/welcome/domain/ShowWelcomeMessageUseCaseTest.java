package test.com.rubenvj.makefile.features.welcome.domain;

import main.com.rubenvj.makefile.features.welcome.domain.ShowWelcomeMessageUseCase;
import org.junit.jupiter.api.*;
import org.junit.platform.commons.annotation.Testable;
import test.com.rubenvj.makefile.features.welcome.data.Stub2AppExecutionDataRepository;
import test.com.rubenvj.makefile.features.welcome.data.Stub3AppExecutionDataRepository;
import test.com.rubenvj.makefile.features.welcome.data.StubAppExecutionDataRepository;

public class ShowWelcomeMessageUseCaseTest {
    private ShowWelcomeMessageUseCase showWelcomeMessageUseCase;

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
        showWelcomeMessageUseCase = null;
    }

    @Test
    public void siEsNullNoMuestraElMensaje () {
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(new StubAppExecutionDataRepository());

        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(showMessage);
    }

    @Test
    public void cuandoObtengoUnNumeroDistintoDeCeroNoMuestroElMensaje() {
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(new Stub3AppExecutionDataRepository());

        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(showMessage);
    }

    @Test
    public void cuandoObtengoUnCeroMuestroElMensaje() {
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(new Stub2AppExecutionDataRepository());

        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertTrue(showMessage);
    }
}
