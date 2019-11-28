package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.control.Motor;
import org.firstinspires.ftc.teamcode.control.MultiMotorDriver;
import org.firstinspires.ftc.teamcode.control.PID;

public class DriveBase
{
    private static final double WHEEL_CIRCUMFRENCE = 0.12;
    private static final double TURNING_RADIUS = 0.1;

    private MultiMotorDriver left;
    private MultiMotorDriver right;

    public DriveBase(MultiMotorDriver right, MultiMotorDriver left)
    {
        this.right = right;
        this.left = left;
    }

    public void teleOpdrive(Gamepad gamepad)
    {
        double leftPower, rightPower, upPower, downPower;
        leftPower = rightPower = 0;

        leftPower = gamepad.left_stick_y - gamepad.right_stick_x*0.6;
        rightPower = gamepad.left_stick_y + gamepad.right_stick_x*0.6;

        left.setPower(leftPower);
        right.setPower(rightPower);
    }

    public void autoDrive()
    {

    }



}