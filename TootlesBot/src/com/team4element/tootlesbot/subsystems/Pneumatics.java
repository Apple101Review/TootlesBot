package com.team4element.tootlesbot.subsystems;

import com.team4element.tootlesbot.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

//@author Shawn Schwartz

public class Pneumatics extends Subsystem {
   private final Compressor airCompressor;
    private final DoubleSolenoid doubleSolenoid;

    public void initDefaultCommand() {
    }
    public Pneumatics() {
       //airCompressor = new Compressor(1,2);
       airCompressor = new Compressor(RobotMap.pressureSwitchChannel, RobotMap.compressorRelayChannel);
       // doubleSolenoid = new DoubleSolenoid(1,2);
       doubleSolenoid = new DoubleSolenoid(RobotMap.DSforwardChannel, RobotMap.DSreverseChannel);
    }
    
    public void startCompressor() {
        airCompressor.start();
    }
    
    public void shiftHigh() {
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void shiftLow() {
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}