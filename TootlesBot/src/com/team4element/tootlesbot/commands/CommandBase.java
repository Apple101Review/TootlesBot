package com.team4element.tootlesbot.commands;

import com.team4element.tootlesbot.OI;
import com.team4element.tootlesbot.RobotMap;
import com.team4element.tootlesbot.subsystems.DriveSubsystem;
import com.team4element.tootlesbot.subsystems.Pneumatics;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Command;
/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    
    public static Gyro gyro = new Gyro(RobotMap.gyroAnalogInput); //Makes a GYRO as a subsystem, where no file class is present in the subsystems package.
    public static DriveSubsystem drive = new DriveSubsystem();
    public static Pneumatics pneumatics = new Pneumatics();
     
    public static void init() {
        oi = new OI();
        // Show what command your subsystem is running on the SmartDashboard
       //  SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}