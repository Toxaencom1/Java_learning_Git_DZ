package Java_DZ.DZ2;

import java.io.File;
import java.io.FileWriter;


//2 . Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task_2 {

    public static StringBuilder arrToStringBuilder(int[] arr){
        StringBuilder sb = new StringBuilder(" ");
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) sb.append(arr[i]);
            else sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb;
    }

    public static void writeToFile(String data) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\Java_DZ\\DZ2\\Task2_file.txt");
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

    public static void main(String[] args) {
        int[] arr = {3,1,5,0,7,9,8};
        StringBuilder stb = arrToStringBuilder(arr);
        StringBuilder result = arrToStringBuilder(arr);
        StringBuilder stb2 = new StringBuilder();
        System.out.println(stb+" = Source array\n");
        stb.append(" = Source array");
        result.append(" = Source array\n");

        int i = 0;
        int temp;
        while (i<arr.length-1){
            stb.delete(0,stb.length());
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
                i = -1;
            }
            i++;
            stb = arrToStringBuilder(arr);

            if (!stb2.toString().equals(stb.toString())){
                System.out.println(stb);
                result.append(stb).append("\n");
            }

            stb2.delete(0,stb.length());
            stb2 = arrToStringBuilder(arr);
        }
        writeToFile(result.toString());
    }
}
