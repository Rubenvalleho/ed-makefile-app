package com.rubenvj.makefile.features;

import com.rubenvj.makefile.features.appexecution.presentation.AppExecutionPresentation;
import com.rubenvj.makefile.features.vote.presentation.VotePresentation;
import com.rubenvj.makefile.features.welcome.presentation.WelcomePresentation;

public class Main {
    public static void main(String[] args) {
        AppExecutionPresentation.appOpened();
        WelcomePresentation.welcomeMessage();
        VotePresentation.voteAppMessage();
    }
}