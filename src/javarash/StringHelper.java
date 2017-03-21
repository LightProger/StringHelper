package javarash;

/*
Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = s;
            System.out.print(result);
        }
        System.out.println("");
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int j = 0; j < count; j++){
            result = s;
            System.out.print(result);

        }
        return result;
    }


    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        stringHelper.multiply("Амиго");
        stringHelper.multiply("Амиго", 8);
    }
}