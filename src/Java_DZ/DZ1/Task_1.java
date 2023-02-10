package Java_DZ.DZ1;




//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//        (произведение чисел от 1 до n)


public class Task_1 {
    public static void main(String[] args){
        int n = validator.validatePosInt();
        int result = (n * (n + 1)) / 2;
        System.out.println("n-ое треугольного число = " + result);
    }
}
