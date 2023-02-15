package Java_DZ.DZ2;

import java.util.HashMap;
import java.util.Map;


//1 . Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//
//        Если значение null, то параметр не должен попадать в запрос.
//
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


public class Task_1 {


    public static StringBuilder request(Map<String, String> data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> item : data.entrySet()) {
            if (item.getValue() != null) {
                stringBuilder.append(item.getKey()).append(" = '").append(item.getValue()).append("' and ");
            }
        }
        stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length());
        return stringBuilder;
    }


    public static void main(String[] args) {
        Map<String, String> stringJson = new HashMap<>();
        stringJson.put("name", "Ivanov");
        stringJson.put("country", "Russia");
        stringJson.put("city", "Moscow");
        stringJson.put("age", null);
        System.out.print("select * from students where ");
        System.out.println(request(stringJson));
    }

}
