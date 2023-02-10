package Java_DZ.DZ1;

//2. Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while (n < 1000) {
            for (int i = n; i > 0; i--) {
                if (n % i == 0) {
                    count++;
                    if (count > 2) {
                        count = 0;
                        break;
                    }
                }
            }
            if (count == 2) {
                System.out.print(n+" ");
                count=0;
            } else if (count<2) count=0;
            if (n == 241 || n== 523 || n == 829) System.out.print("\n");
            n++;
        }
    }
}
