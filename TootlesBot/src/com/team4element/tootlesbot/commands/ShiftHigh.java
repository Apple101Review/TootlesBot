package com.team4element.tootlesbot.commands;

//@author Shawn Schwartz

public class ShiftHigh extends CommandBase {
    
    public ShiftHigh() {
    }

    protected void initialize() {
    }

    protected void execute() {
        pneumatics.shiftHigh();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}