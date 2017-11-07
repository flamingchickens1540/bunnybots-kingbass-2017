package org.team1540.kingbass.commands.intake;

import edu.wpi.first.wpilibj.command.Command;
import org.team1540.kingbass.Robot;
import org.team1540.kingbass.Tuning;

/**
 * Runs the intake inwards.
 *
 * @author Zachary Robinson
 */
public class IntakeIn extends Command {

  /**
   * Constructs an {@link IntakeIn}.
   */
  public IntakeIn() {
    super("Run Intake In");
    requires(Robot.intake);
  }

  @Override
  protected void initialize() {
    Robot.intake.setMotor(Tuning.getIntakeSetPoint());
  }

  @Override
  protected void interrupted() {
    Robot.intake.setMotor(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
