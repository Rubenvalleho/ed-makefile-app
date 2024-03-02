package test.com.rubenvj.makefile.features.vote.data;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class StubNullAppExecutionDataRepository implements AppExecutionRepository {

    @Override
    public AppExecution getAppExecution() {
        return null;
    }

    @Override
    public void saveAppExecution(AppExecution appExecution) {

    }
}
