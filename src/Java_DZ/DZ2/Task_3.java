package Java_DZ.DZ2;

//3* . Дана json строка (можно сохранить в файл и читать из файла)
//
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//
//        Пример вывода:
//
//        Студент Иванов получил 5 по предмету Математика.
//
//        Студент Петрова получил 4 по предмету Информатика.
//
//        Студент Краснов получил 5 по предмету Физика.


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Task_3 {

    public static void writeToFile(String data) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\Java_DZ\\DZ2\\Task3_out.txt");
            File file = new File(pathFile);
//            System.out.println(file.getAbsolutePath());
//            System.out.println(pathFile);
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(data + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не по плану");
        }
    }


    public static String readFileJson() {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\src\\Java_DZ\\DZ2\\Task3_in.json");
        try (FileReader reader = new FileReader(pathFile)) {
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            return json.toString();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }


    public static void main(String[] args) {
        String json = readFileJson();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (json != null) {
            json = json.substring(2, json.length() - 2);
            json = json.replace("},{", " ");
            String[] json_arr = json.split(" ");
            for (String item : json_arr) {
                for (String mark : item.split(",")) {
                    if (count == 0) {
                        sb.append("Студент ").append(mark.split(":")[1]);
                    } else if (count == 1) {
                        sb.append(" получил ").append(mark.split(":")[1]);
                    } else if (count == 2) {
                        sb.append(" по предмету ").append(mark.split(":")[1]).append("\n");
                    }
                    count++;
                }
                count = 0;
            }
            System.out.println(sb);
            writeToFile(sb.toString());
        }
    }
}
