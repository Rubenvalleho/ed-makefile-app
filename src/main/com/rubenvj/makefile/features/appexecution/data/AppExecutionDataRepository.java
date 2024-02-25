package main.com.rubenvj.makefile.features.appexecution.data;

import main.com.rubenvj.makefile.features.appexecution.data.local.FileLocalDataSource;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecutionRepository;

public class AppExecutionDataRepository implements AppExecutionRepository {

    private FileLocalDataSource fileLocalDataSource;
    private static AppExecutionDataRepository instance = null;

    public static AppExecutionDataRepository newInstance() {
        if (instance == null) {
            return instance = new AppExecutionDataRepository();
        }
        return instance;
    }

    public AppExecution getAppExecution() {
        return fileLocalDataSource.obtain();
    }

    public void saveAppExecution(AppExecution appExecution) {
        fileLocalDataSource.save(appExecution);
    }
}
