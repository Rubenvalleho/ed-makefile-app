package test.com.rubenvj.makefile.features.welcome.data;

import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class Stub3AppExecutionDataRepository implements AppExecutionRepository {
    public AppExecution getAppExecution() {
        return new AppExecution(2);
    }

    public void saveAppExecution(AppExecution appExecution) {

    }
}
