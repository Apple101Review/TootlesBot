package com.team4element.tootlesbot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //JOYSTICKS
    public static final int leftJoy = 1;
    public static final int rightJoy = 2;
    public static final int opJoy = 3;
    
    //BUTTONS
    public static final int driveStraightButton = 1;
    public static final int shiftHighButton = 2;
    public static final int shiftLowButton = 3;
    public static final int compressorStartButton = 1;
    
    //GYRO
    public static final int gyroAnalogInput = 1;
    
    //MOTORS
    public static final int frontLeftMotor = 1;
    public static final int rearLeftMotor = 2;
    public static final int frontRightMotor = 3;
    public static final int rearRightMotor = 4;
    
    //PNEUMATICS
    public static final int pressureSwitchChannel = 1;
    public static final int compressorRelayChannel = 2;
    public static final int DSforwardChannel = 1;
    public static final int DSreverseChannel = 2;
}