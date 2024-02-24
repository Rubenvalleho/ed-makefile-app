package main.com.rubenvj.makefile.features.appexecution.domain;

public interface AppExecutionRepository {
    public AppExecution getAppExecution();
    public void saveAppExecution(AppExecution appExecution);
}
