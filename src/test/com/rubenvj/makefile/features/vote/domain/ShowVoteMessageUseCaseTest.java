package test.com.rubenvj.makefile.features.vote.domain;

import main.com.rubenvj.makefile.features.vote.domain.ShowVoteAppMessageUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.com.rubenvj.makefile.features.vote.data.StubCincoMayorAppExecutionDataRepository;
import test.com.rubenvj.makefile.features.vote.data.StubMenorCincoAppExecutionDataRepository;
import test.com.rubenvj.makefile.features.vote.data.StubNullAppExecutionDataRepository;

public class ShowVoteMessageUseCaseTest {
    private ShowVoteAppMessageUseCase showVoteAppMessageUseCase;

    @BeforeEach
    public void saveUp() {

    }

    @AfterEach
    public void tearsDown() {

    }

    @Test
    public void cuandoEsNullNoEntoncesNoMuestraElMensaje() {
     showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(new StubNullAppExecutionDataRepository());

     boolean isNull = showVoteAppMessageUseCase.execute();

     Assertions.assertFalse(isNull);
    }

    @Test
    public void cuandoEsMenorQueCincoNoMuestraElMensaje() {
        //Given
        showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(new StubMenorCincoAppExecutionDataRepository());

        //When
        boolean isMenorQueCinco = showVoteAppMessageUseCase.execute();

        //Then: Asserts

        Assertions.assertFalse(isMenorQueCinco);
    }

    @Test
    public void cuandoEsCincoOMayorMuestraElMensaje() {
        showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(new StubCincoMayorAppExecutionDataRepository());

        boolean isCinco = showVoteAppMessageUseCase.execute();

        Assertions.assertTrue(isCinco);
    }
}
