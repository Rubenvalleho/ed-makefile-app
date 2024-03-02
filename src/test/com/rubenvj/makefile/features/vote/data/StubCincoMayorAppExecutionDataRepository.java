package test.com.rubenvj.makefile.features.vote.data;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class StubCincoMayorAppExecutionDataRepository implements AppExecutionRepository {

    @Override
    public AppExecution getAppExecution() {
        return new AppExecution(5);
    }

    @Override
    public void saveAppExecution(AppExecution appExecution) {

    }
}
