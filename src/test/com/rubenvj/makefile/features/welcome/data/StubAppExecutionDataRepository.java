package test.com.rubenvj.makefile.features.welcome.data;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class StubAppExecutionDataRepository implements AppExecutionRepository {
    public AppExecution getAppExecution() {
        return null;
    }

    public void saveAppExecution(AppExecution appExecution) {

    }
}
