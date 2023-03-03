package Java_DZ.DZ6;

import java.io.IOException;
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
    public static void main(String[] args) throws IOException {
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
        Notebook n6 = new Notebook("MSI", "Modern", 14.0, "Отсутствует",
                10, 1.7, 16, 512);
        Notebook n7 = new Notebook("Acer", "Aspire", 15.6, "Отсутствует",
                4, 2.4, 8, 512);
        Notebook n8 = new Notebook("Acer", "Aspire", 15.6, "Отсутствует",
                4, 2.4, 8, 512);
        Notebook n9 = new Notebook("ASUS", "TUF", 15.6, "RTX3060",
                8, 2.0, 16, 512);
        System.out.println(n1.getId());

        HashSet<Notebook> notebooks = new HashSet<>(Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8, n9));
        System.out.println("Здравствуй пользователь! Это поиск ноутбуков по фильтру ");
        filter(notebooks);

    }
    static void filter(HashSet<Notebook> notebooks ){
        HashMap<Integer, String> notebookMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true) {
            boolean flag1 = true;
            Menu.showMenu(Menu.filterChoiceMenu());
            int choiceFilter = Validator.valMenuChoice(scanner.nextLine(), 3);
            if (choiceFilter == 3) {
                scanner.close();
                System.exit(0);
            }
            System.out.println("\nЗадайте параметры фильтрации! Введите \"0\" " +
                    "если параметр не нужен или exit для выхода ");
            notebookMap.put(1, "0"); notebookMap.put(2, "0"); notebookMap.put(3, "0"); notebookMap.put(4, "0");
            notebookMap.put(5, "0"); notebookMap.put(6, "0"); notebookMap.put(7, "0"); notebookMap.put(8, "0");
            while (flag1) {
                Menu.showMenu(Menu.paramChoiceMenu());
                int choiceParam = Validator.valMenuChoice(scanner.nextLine(), 9);
                switch (choiceParam) {
                    case 1 -> {
                        System.out.println("Например Asus, Acer, MSI, Lenovo ...");
                        System.out.print("Фильтр по производителю: ");
                        String manufacturer = Validator.emergency_exit(scanner.nextLine().toLowerCase().trim());
                        notebookMap.put(1, manufacturer);
                    }
                    case 2 -> {
                        System.out.println("Например Tuf, ROG, Vector, Aspire, Modern, Thinkpad, NITRO ...");
                        System.out.print("Фильтр по модели: ");
                        String model = Validator.emergency_exit(scanner.nextLine().toLowerCase().trim());
                        notebookMap.put(2, model);
                    }
                    case 3 -> {
                        System.out.print("Фильтр по размеру монитора: ");
                        double screenSize = Validator.valDouble(scanner.nextLine());
                        notebookMap.put(3, Double.toString(screenSize));
                    }
                    case 4 -> {
                        System.out.println("Например RTX3080Ti, RTX3050, Отсутствует ...");
                        System.out.print("Фильтр по дискретному видео адаптеру: ");
                        String discretVideoAdapter = Validator.emergency_exit(scanner.nextLine().toLowerCase().trim());
                        notebookMap.put(4, discretVideoAdapter);
                    }
                    case 5 -> {
                        System.out.print("Фильтр по количеству ядер: ");
                        int cpuCores = Validator.valInt(scanner.nextLine());
                        notebookMap.put(5, Integer.toString(cpuCores));
                    }
                    case 6 -> {
                        System.out.print("Фильтр по частоте процессора: ");
                        double cpu = Validator.valDouble(scanner.nextLine());
                        notebookMap.put(6, Double.toString(cpu));
                    }
                    case 7 -> {
                        System.out.print("Фильтр по количеству оперативной памяти: ");
                        int RAM = Validator.valInt(scanner.nextLine());
                        notebookMap.put(7, Integer.toString(RAM));
                    }
                    case 8 -> {
                        System.out.print("Фильтр по количеству памяти ЖД: ");
                        int HDD = Validator.valInt(scanner.nextLine());
                        notebookMap.put(8, Integer.toString(HDD));
                    }
                    case 9 -> flag1 = false;
                    default -> System.out.println("Что то пошло не так");
                }
            }

            boolean flag2 = false;
            if (choiceFilter == 1) {
                System.out.println();
                for (Notebook item : notebooks) {
                    if ((item.getManufacturer().equals(notebookMap.get(1)) || notebookMap.get(1).equals("0"))
                            && (item.getModel().equals(notebookMap.get(2)) || notebookMap.get(2).equals("0"))
                            && item.getScreenSize() >= Double.parseDouble(notebookMap.get(3))
                            && (item.getDiscretVideoAdapter().equals(notebookMap.get(4)) || notebookMap.get(4).equals("0"))
                            && item.getCpuCores() >= Integer.parseInt(notebookMap.get(5))
                            && item.getCpu() >= Double.parseDouble(notebookMap.get(6))
                            && item.getRAM() >= Integer.parseInt(notebookMap.get(7))
                            && item.getHDD() >= Integer.parseInt(notebookMap.get(8))) {
                        flag2 = true;
                        System.out.printf("%d - %s\n", count, item);
                        count++;
                    }
                }
                if (!flag2) {
                    System.out.println("Ноутбуков с такими параметрами нет (((");
                }
                count = 1;
            } else if (choiceFilter == 2) {
                System.out.println();
                if (notebookMap.get(3).equals("0")) {notebookMap.put(3,"100");}
                if (notebookMap.get(5).equals("0")) {notebookMap.put(5,"100");}
                if (notebookMap.get(6).equals("0")) {notebookMap.put(6,"10");}
                if (notebookMap.get(7).equals("0")) {notebookMap.put(7,"200");}
                if (notebookMap.get(8).equals("0")) {notebookMap.put(8,"10000");}
                for (Notebook item : notebooks) {
                    if ((item.getManufacturer().equals(notebookMap.get(1)) || notebookMap.get(1).equals("0"))
                            && (item.getModel().equals(notebookMap.get(2)) || notebookMap.get(2).equals("0"))
                            && item.getScreenSize() <= Double.parseDouble(notebookMap.get(3))
                            && (item.getDiscretVideoAdapter().equals(notebookMap.get(4)) || notebookMap.get(4).equals("0"))
                            && item.getCpuCores() <= Integer.parseInt(notebookMap.get(5))
                            && item.getCpu() <= Double.parseDouble(notebookMap.get(6))
                            && item.getRAM() <= Integer.parseInt(notebookMap.get(7))
                            && item.getHDD() <= Integer.parseInt(notebookMap.get(8))) {
                        flag2 = true;
                        System.out.printf("%d - %s\n", count, item);
                        count++;
                    }
                }
                if (!flag2) {
                    System.out.println("Ноутбуков с такими параметрами нет (((");
                }
                count = 1;
            }
            Menu.showMenu(Menu.continueMenu());
            int choice = Validator.valMenuChoice(scanner.nextLine(), 2);
            if (choice == 2) {
                scanner.close();
                System.exit(0);
            }
        }
    }
}
