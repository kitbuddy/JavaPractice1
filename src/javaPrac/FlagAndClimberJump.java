package javaPrac;

public class FlagAndClimberJump {

    public static void main(String[] args) {
        int flagHeight = 9;
        int jumpHeight = 2;

        FlagAndClimberJump.calculateJump(flagHeight, jumpHeight);
    }

    private static void calculateJump(Integer flagHeight, Integer jumpHeight) {
        int numberOfJumps = flagHeight/jumpHeight;

        int jumpOfHeight1 = flagHeight%jumpHeight;

        System.out.println("numberOfJumps -> " + numberOfJumps);
        System.out.println("jumpOfHeight1 -> " + jumpOfHeight1);
    }
}
