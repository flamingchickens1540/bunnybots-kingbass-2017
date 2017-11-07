package org.team1540.kingbass.commands.claw;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.team1540.kingbass.Robot;

/**
 * Closes the pneumatic claw.
 *
 * @author Zachary Robinson
 */
public class CloseClaw extends Command {
  Timer t = new Timer();

  /**
   * Constructs a {@link CloseClaw}.
   */
  public CloseClaw() {
    super("Close claw");
    requires(Robot.claw);
  }

  @Override
  protected void end() {
    Robot.claw.stop();
  }

  @Override
  protected void initialize() {
    Robot.claw.startGrab();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
