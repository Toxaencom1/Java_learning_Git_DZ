package Java_DZ.DZ1;

import java.util.Scanner;

public class validator {
    public static void main(String[] args){


    }
    static int validatePosInt(){
        System.out.print("Введите n число: ");
        while (true){
            try{
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n > 0 && n<2_147_483_647) {
                    scanner.close();
                    return n;
                } else System.out.print("Введи 'число!', больше нуля: ");

            }
            catch (Exception ex){
                System.out.print("Введи 'число!', больше нуля: ");

            }
        }
    }
}
