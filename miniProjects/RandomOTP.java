package miniProjects;

import java.util.concurrent.ThreadLocalRandom;

public class RandomOTP {
    public static void main(String[] args) {
        System.out.println("Random OTP : "+ ThreadLocalRandom.current().nextInt(100000 ,999999));
    }
}
