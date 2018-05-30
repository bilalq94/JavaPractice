package qureshi.bilal.learnjava;

public class HelloWorld {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameover = (lives < 1);
        System.out.println(isGameover);


        if(isGameover) {
            System.out.println("Game over!");

        } else {
            System.out.println("You're still alive!");
        }
    }
}
