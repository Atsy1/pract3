import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zadanie1
//        System.out.println("Ведите факториал");
//        int value = new Scanner(System.in).nextInt();
//        int factorial = 1;
//        for(int i=1; i <=value;i++){
//            factorial*=i;
//
//        }
//        System.out.println(value + "! ="+ factorial );


        //zadanie2
//        System.out.println("Ведите целое положительное число");
//        int value = new Scanner(System.in).nextInt();
//
//
//
//
//        for (int i = 0; i <= value; i++){
//            for (int j = 0; j<= value; j++){
//                if(i*j == value){
//                    System.out.println(i + "*" + j);
//                }
//            }
//        }


        //zadanie3


//        int volume = 1200;
//
//        int fillingSpeed = 30;
//        int devastationSpeed = 10;
//        int a =fillingSpeed - devastationSpeed;
//
//        int countMinutes;
//
//        while (volume> a){
//
//            countMinutes = volume / a;
//            System.out.println(countMinutes + "минут");
//            break;
//        }

        //zadanie4
        System.out.println("Ведите загаданое число");
        int value = new Scanner(System.in).nextInt();


        boolean guessed = false;
        while (!guessed){
            System.out.println("Ведите число");
            int value1 = new Scanner(System.in).nextInt();
            if(value==value1){
                System.out.println("Вы угадали");
                guessed = true;
            }
            else if(value > value1){
                System.out.println("Загадочное число больше");
            }
            else {
                System.out.println("Загадочное число меньше");
            }


        }

    }
}