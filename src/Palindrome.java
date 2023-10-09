import java.util.Scanner;

/**
 * Класс Palindrome предназначен для проверки, является ли строка палиндромом.
 * @author Серявина Софья
 */
public class Palindrome {
    /**
     * Метод palindromeChecker проверяет, является ли строка палиндромом.
     * @param check строка для проверки
     * @return true, если строка является палиндромом, false в противном случае
     */
    public static boolean palindromeChecker(String check){
        String cleanStr = check.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase().replaceAll("\\s", ""); //удаляет все знаки препинания, приводит все буквы к нижнему регистру и удаляет пробелы в строке check.
        String reversedStr = new StringBuilder(cleanStr).reverse().toString(); //разворачивает строку cleanStr.
        return cleanStr.equals(reversedStr); //сравнивает исходную строку cleanStr и развернутую строку reversedStr и возвращает true, если они равны, и false, если не равны.
    }
    /**
     * Метод main считывает строку с консоли и проверяет, является ли она палиндромом.
     * Если строка является палиндромом, метод выводит сообщение "Строка является палиндромом".
     * Если строка не является палиндромом, метод выводит сообщение "Строка не является палиндромом".
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String str = in.nextLine();
        if(palindromeChecker(str)){
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
