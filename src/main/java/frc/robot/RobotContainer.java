// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.SimpleMotor;



/** Add your docs here. */
@Logged
public class RobotContainer {
  private static final int kJoystickPort = 0;
  private Joystick m_joystick = new Joystick(kJoystickPort);

  private SimpleMotor simpleMotor = new SimpleMotor(m_joystick);

  public void periodic() {
    simpleMotor.periodic();
  }
}
