package org.firstinspires.ftc.quadx.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.quadx.Libraries.MyOpMode;

/**
 * Created by jspspike on 11/3/16.
 */


@Autonomous(name="Shoot Stop", group="Blue")
public class ShootBlueStop extends MyOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        hardwareMap();
        initServos();
        initSensors();

        double flyPow = .66;

        waitForStart();

        double startingVoltage = hardwareMap.voltageSensor.get("Motor Controller 5").getVoltage();


        telemetry.addData("Volatage", startingVoltage);


        delay(8000);
        arcTurn(.5, 40);
        flywheel.setPower(flyPow);
        moveTo(.2, 2800, 8);
        delay(2000);
        door.setPosition(DOOR_OPEN);
        delay(4000);
        door.setPosition(DOOR_CLOSED);
        flywheel.setPower(0);
    }
}