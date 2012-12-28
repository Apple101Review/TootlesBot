
package com.team4element.tootlesbot;

import com.team4element.tootlesbot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick leftJoy;
    public Joystick rightJoy;
    public Joystick opJoy;
   
    public OI() {
        Joystick leftJoy = new Joystick(RobotMap.leftJoy);
        Joystick rightJoy = new Joystick(RobotMap.rightJoy);
        Joystick opJoy = new Joystick(RobotMap.opJoy);
        
        getButton(leftJoy, RobotMap.driveStraightButton).whileHeld(new DriveStraight(0, 0, 0));
        
        getButton(leftJoy, RobotMap.shiftHighButton).whenReleased(new ShiftHigh());
        getButton(leftJoy, RobotMap.shiftLowButton).whenReleased(new ShiftLow());
        getButton(opJoy, RobotMap.compressorStartButton).whenPressed(new StartCompressor());
     

    }
    
    public Button getButton(Joystick joy, int button) {  //This method makes the following more intuitive.  :: new JoystickButton(leftJoy, RobotMap.shiftHighButton).whenReleased(new ShiftHigh());\\ new JoystickButton(leftJoy, RobotMap.shiftLowButton).whenReleased(new ShiftLow());
        return new  JoystickButton(joy, button);
    }
}