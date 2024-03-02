package test.com.rubenvj.makefile.features.vote.data;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class StubMenorCincoAppExecutionDataRepository implements AppExecutionRepository {

    @Override
    public AppExecution getAppExecution() {
        return new AppExecution(1);
    }

    @Override
    public void saveAppExecution(AppExecution appExecution) {

    }
}
