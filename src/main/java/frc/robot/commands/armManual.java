// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;

import frc.robot.subsystems.*;


public class armManual extends Command {
  private Manipulator manipulator;
  private double power;
 

  public armManual(Manipulator manipulator, double power) {
    this.manipulator = manipulator;
    this.power = power;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(manipulator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
     
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
manipulator.move_arm(power);
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    manipulator.move_arm(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
   return false;

  }
}