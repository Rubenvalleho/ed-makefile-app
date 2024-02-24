package main.com.rubenvj.makefile.features;

import main.com.rubenvj.makefile.features.appexecution.presentation.AppExecutionPresentation;
import main.com.rubenvj.makefile.features.vote.presentation.VotePresentation;
import main.com.rubenvj.makefile.features.welcome.presentation.WelcomePresentation;

public class Main {
    public static void main(String[] args) {
        AppExecutionPresentation.appOpened();
        WelcomePresentation.welcomeMessage();
        VotePresentation.voteAppMessage();
    }
}