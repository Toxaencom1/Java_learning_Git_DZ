package Java_DZ.DZ6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    public static List<String> mainMenu(){
        return new ArrayList<>(Arrays.asList("Продолжить","Выход"));
    }
    public static void showMenu(List<String> menuList){
        System.out.println();
        for (int i = 0; i < menuList.size(); i++) {
            System.out.printf("%d %s\n", i+1, menuList.get(i));
        }
        System.out.print("Ваш выбор: ");

    }

}
