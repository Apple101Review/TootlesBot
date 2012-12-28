package com.team4element.tootlesbot.commands;

//@author Shawn Schwartz

public class StartCompressor extends CommandBase {
    
    public StartCompressor() {
    }

    protected void initialize() {
    }

    protected void execute() {
        pneumatics.startCompressor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }
    
    protected void interrupted() {
    }
}