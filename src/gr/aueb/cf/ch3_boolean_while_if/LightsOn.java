package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is DARK
 */
public class LightsOn {

    public static void main(String[] args) {
        boolean isDark;
        boolean isRaining;
        boolean isCarRunning;
        boolean areLightsOn;
        Scanner in = new Scanner(System.in);
        int carSpeed;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);
        // areLightsOn = (isRaining && isDark) || (isRaining && isCarRunning;

        System.out.println("Turn lights on: " + areLightsOn);

    }
}
