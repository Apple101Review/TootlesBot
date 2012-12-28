package com.team4element.tootlesbot.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

//@author Shawn Schwartz
 
public class DriveStraight extends PIDCommand {
    
    public DriveStraight(double p, double i, double d) {
        super(p,i,d);
    }
    
    protected double returnPIDInput() {
        return CommandBase.gyro.getAngle();
    }
    
    protected void usePIDOutput(double output) {
        CommandBase.drive.arcade(0, output);
    }

    protected void initialize() {
        SmartDashboard.putData(this);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }
}