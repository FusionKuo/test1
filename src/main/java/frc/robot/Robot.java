// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.XboxController;
//導入函式庫

public class Robot extends TimedRobot {
  //創物件
  private final WPI_TalonSRX motor = new WPI_TalonSRX(5); //5號馬達
  private final XboxController xboxController = new XboxController(0); //0 (FrcDriverStation的第一個連接阜)
  //淺色底部分為提示字元 不用打
  
  @Override
  public void robotInit() {
    //初始化物件
    motor.configFactoryDefault();
    //設定馬達反轉
    motor.setInverted(true);
  }
  @Override
  public void teleopPeriodic() {
    motor.set(ControlMode.PercentOutput, xboxController.getLeftY());
    //設定xbox控制器的參數
  }
}
