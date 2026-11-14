// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SimpleMotor extends SubsystemBase {
  private static final int kMotorPort = 10;
  private final SparkMax m_motor;
  private Joystick m_joystick;

  /** Creates a new SimpleMotor. */
  public SimpleMotor(Joystick joystick) {
    m_motor = new SparkMax(kMotorPort, MotorType.kBrushed);
    m_joystick = joystick;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_motor.set(m_joystick.getY());
  }
}
