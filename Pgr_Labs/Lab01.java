import java.util.HashMap; //библиотека джавы
import java.util.Map;

public class Leetcode { // название класса
    public static void main(String[] args) {
        // создание массива и присвоение ему значений
        Object[] arr = { true, "hello", 5, 12, -200, false, false, "word" };
        // использование функции HashMap
        Map<String, Integer> type = new HashMap<>();

        // цикл "for-each"
        // перебирает значения массива arr и каждый елемент присваивает elem
        for (Object elem : arr) {
            String name; // в переменную вписывается навание елемента

            // цикл "if-else"
            if (elem == null) { //
                name = "null";
            } else {
                name = elem.getClass().getSimpleName();
            }

            // подсчёт ключ (String/Boolean) с библиотеки и добавляет +1 (увеличивает
            // счётчик типа)
            type.put(name, type.getOrDefault(name, 0) + 1);
            // type.put -> обновляет и добавляет значение в Map
        }

        // используется лямба
        // метод "for-each", который подбирает нужные ключи и значения, после чего
        // выводит
        type.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}