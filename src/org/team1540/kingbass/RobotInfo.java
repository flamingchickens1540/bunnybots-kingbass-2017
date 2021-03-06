package org.team1540.kingbass;

/**
 * Robot Information such as the drive gear ratio, motor/pneumatic ports, and other such things.
 * This is for stuff rooted in the physical robot, as opposed to constants for algorithms which
 * should go in {@link Tuning}.
 *
 * @author Zachary Robinson
 */
public class RobotInfo {
  // info
  // ratios are between the motor shaft and the encoder
  // three-stage gearbox, 14:64, 20:60, and shifting stage 20:54 low or 30:44 high
  public static final double DRIVE_LOW_GEAR_RATIO = 0.02700617284;
  public static final double DRIVE_HIGH_GEAR_RATIO = 0.04971590909;

  // motor stats
  public static final int CIM_FREE_SPEED = 5330;

  // encoder stats
  public static final int ENCODER_CODES_PER_REV = 4096;

  // motors
  // drivetrain
  /**
   * Left drive motor with encoder connected.
   */
  public static final int L_MASTER = 1;
  /**
   * Left drive motor with no encoder.
   */
  public static final int L_SLAVE_A = 2;
  /**
   * Left drive motor with no encoder.
   */
  public static final int L_SLAVE_B = 3;

  /**
   * Right drive motor with encoder connected.
   */
  public static final int R_MASTER = 4;
  /**
   * Right drive motor with no encoder.
   */
  public static final int R_SLAVE_A = 5;
  /**
   * Right drive motor with no encoder.
   */
  public static final int R_SLAVE_B = 6;

  // intake
  /**
   * Intake drive motor.
   */
  public static final int INTAKE_A = 11;

  // arm
  /**
   * Arm motor with encoder.
   */
  public static final int ARM_A = 7;
  /**
   * Arm motor without encoder.
   */
  public static final int ARM_B = 8;

  // claw
  /**
   * Motor for the left claw finger.
   */
  public static final int L_CLAW = 9;
  /**
   * Motor for the right claw finger.
   */
  public static final int R_CLAW = 10;


  // pneumatics
  // shifters
  /**
   * Shifter for the left gearbox.
   */
  public static final int L_SHIFTER = 0;
  /**
   * Shifter for the right gearbox.
   */
  public static final int R_SHIFTER = 1;
  public static final int CAMERA_CENTER_X = 320;
  public static final int CAMERA_CENTER_Y = 240;
}
