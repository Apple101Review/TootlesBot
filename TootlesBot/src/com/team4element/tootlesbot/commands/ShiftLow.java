package com.team4element.tootlesbot.commands;

//@author Shawn Schwartz

public class ShiftLow extends CommandBase {
    
    public ShiftLow() {
    }

    protected void initialize() {
    }

    protected void execute() {
        pneumatics.shiftLow();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}