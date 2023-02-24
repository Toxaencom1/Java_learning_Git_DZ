package Java_DZ.DZ5;

import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
public class Task_1 {
    public static void main(String[] args) {
        String data = FileJob.readFile("Task1_file.txt");
        List<String> phonebookList = new ArrayList<>();
        List<String> tempContactList;
        List<String> tempPhoneList;
        Map<String, List<String>> map = new HashMap<>();
        if (data != null) {
            phonebookList = List.of(data.trim().split("\n"));
        }
//        System.out.println(phonebookList);
        for (String el : phonebookList) {
            tempContactList = List.of(el.split("~"));
            tempPhoneList = List.of(tempContactList.get(1).split(";"));
            map.put(tempContactList.get(0), tempPhoneList);
        }
        System.out.println("Реализация с помощью HashMap " + map + "\n");
        showAll(map);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите \"Имя Фамилию\" для поиска: ");
        String name = scanner.nextLine().trim();
        findContact(name, map);
        scanner.close();
    }

    public static void findContact(String name, Map<String, List<String>> phoneBook) {
        boolean flag = false;
        for (Map.Entry<String, List<String>> contact : phoneBook.entrySet()) {
            if (contact.getKey().equalsIgnoreCase(name)) {
                flag = true;
                System.out.println(contactBuilder(contact));
            }
        }
        if (!flag) {
            System.out.println("Такого контакта нет!");
        }
    }

    public static void showAll(Map<String, List<String>> phoneBook) {
        for (Map.Entry<String, List<String>> contact : phoneBook.entrySet()) {
            System.out.println(contactBuilder(contact));
        }
    }

    public static String contactBuilder(Map.Entry<String, List<String>> contact) {
        StringBuilder phones = new StringBuilder();
        for (String phoneNumber : contact.getValue()) {
            if (contact.getValue().size() > 1) {
                phones.append(phoneNumber).append(", ");
            } else {
                phones = new StringBuilder(phoneNumber);
            }
        }
        if (contact.getValue().size() > 1) {
            phones.delete(phones.length() - 2, phones.length());
        }
        return contact.getKey() + " - тел: " + phones;
    }
}
