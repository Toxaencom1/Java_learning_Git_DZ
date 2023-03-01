package Java_DZ.DZ6;

import java.util.*;


/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("MSI", "Vector", 15.6, "RTX3080Ti",
                14, 2.5, 16, 1000);
        Notebook n2 = new Notebook("ASUS", "ROG", 13.4, "RTX3050",
                14, 2.3, 16, 512);
        Notebook n3 = new Notebook("Acer", "Nitro", 15.6, "RTX3050",
                6, 3.3, 16, 512);
        Notebook n4 = new Notebook("Lenovo", "ThinkPad", 15.6, "RTX3050",
                10, 1.3, 16, 512);
        Notebook n5 = new Notebook("ASUS", "ROG", 15.6, "RTX3060",
                8, 3.2, 16, 512);
        Notebook n6 = new Notebook("MSI", "Modern", 14.0, "Absent",
                10, 1.7, 16, 512);
        Notebook n7 = new Notebook("Acer", "Aspire", 15.6, "Absent",
                4, 2.4, 8, 512);
        Notebook n8 = new Notebook("Acer", "Aspire", 15.6, "Absent",
                4, 2.4, 8, 512);
        Notebook n9 = new Notebook("ASUS", "TUF", 15.6, "RTX3060",
                8, 2.0, 16, 512);

        HashSet<Notebook> notebooks = new HashSet<>(Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8, n9));
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true){
            System.out.println("\nЗадайте параметры фильтрации! Введите \"0\" если параметр не нужен ");
            System.out.print("Фильтр по производителю: ");
            String manufacturer = scanner.nextLine().toLowerCase().trim();
            System.out.print("Фильтр по модели: ");
            String model = scanner.nextLine().toLowerCase().trim();
            System.out.print("Фильтр по дискретному видео адаптеру: ");
            String discretVideoAdapter = scanner.nextLine().toLowerCase().trim();
            System.out.print("Фильтр по размеру монитора: ");
            double screenSize = scanner.nextDouble();
            System.out.print("Фильтр по количеству ядер: ");
            int cpuCores = scanner.nextInt();
            System.out.print("Фильтр по частоте процессора: ");
            double cpu = scanner.nextDouble();
            System.out.print("Фильтр по количеству оперативной памяти: ");
            int RAM = scanner.nextInt();
            System.out.print("Фильтр по количеству памяти ЖД: ");
            int HDD = scanner.nextInt();

            System.out.println();
            for (Notebook item : notebooks) {
                if ((item.manufacturer.equals(manufacturer) || manufacturer.equals("0"))
                        && (item.model.equals(model) || model.equals("0")) && item.screenSize >= screenSize &&
                        (item.discretVideoAdapter.equals(discretVideoAdapter) || discretVideoAdapter.equals("0"))
                        && item.cpuCores >= cpuCores
                        && item.cpu >= cpu && item.RAM >= RAM && item.HDD >= HDD) {
                    System.out.printf("%d - %s\n",count,item);
                    count++;
                }
            }
            count = 1;
            Menu.showMenu(Menu.mainMenu());
            int choice = scanner.nextInt();
            if (choice == 2){
                System.exit(0);
            }
        }
    }
}
