package Java_DZ.DZ5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileJob {
    public static String readFile(String fileName) {
        String pathProject = System.getProperty("user.dir");
        String taskPath = "\\src\\Java_DZ\\DZ5\\";
        String pathFile = pathProject.concat(taskPath+fileName);
        try (FileReader reader = new FileReader(pathFile)) {
            StringBuilder data = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                data.append((char) c);
            }
            return data.toString();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void writeToFile(String data) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\Java_DZ\\DZ5\\Task1_file.txt");
            File file = new File(pathFile);
//            System.out.println(file.getAbsolutePath());
//            System.out.println(pathFile);
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(data+"\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не по плану");
        }
    }
}
