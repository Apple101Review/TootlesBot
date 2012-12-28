package com.team4element.tootlesbot.subsystems;

import com.team4element.tootlesbot.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

//@author Shawn Schwartz

public class DriveSubsystem extends Subsystem {
    
    private final RobotDrive drive;

    public void initDefaultCommand() {
    }
    
    public DriveSubsystem() {
        drive = new RobotDrive(RobotMap.frontLeftMotor,
                                                   RobotMap.rearLeftMotor,
                                                   RobotMap.frontRightMotor,
                                                   RobotMap.rearRightMotor);
    }
    
    public void tank(double left, double right) {
        drive.tankDrive(left, right);
    }
    
    public void arcade(double speed, double omega) {
        drive.arcadeDrive(speed, omega);
    }
}