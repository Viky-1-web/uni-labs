#  👾 Lab02: Identifiers, Loops, Functions, Objects & Collections
## ✔️ Identifiers
1. Объявите переменную и запишите в нее свое имя как литерал строки.
2. Объявите константу и запишите в нее год своего рождения как литерал числа.
3. Создайте функцию, которая печатает приветствие и имеет один аргумент: `name`.

```java
public class Lab1 {

    // константа с моим годом рождения
    public static final int birthyear = 2008;

    public static void main(String[] args) {

        // создан массив с единственным аргументом: name
        String myName = "Viktoriia";
        String[] names = { "Maria", "Dascha", "Dami", myName };

        // передвигаемся по масиву и выводим все значения по очереди
        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя: " + names[i]);
        }
    }

```

## ✔️ Loops
4. Реализуйте функцию `range(start: number, end: number): array` которая отдает
массив чисел из диапазона [15, 30] включая крайние числа.
5. Реализуйте функцию `rangeOdd(start: number, end: number): array` которая
отдает массив нечетных чисел из диапазона [15, 30] включая крайние числа.

```
    public class Lab1 {

        int num = 30;  // присваиваем значению num 30

        // проходимся по функции и выводим 
        for (int n = 15; n <= num; n++) {
            System.out.println(n);
        }
    }

```

## ✔️ Functions
Вложенные вызовы функций в цикле
- Реализуйте функцию `average` с сигнатурой
`average(a: number, b: number): number` вычисляющую среднее арифметическое своих
аргументов.
- Реализуйте функцию `square` с сигнатурой `square(x: number): number`
вычисляющую квадрат своего аргумента.
- Реализуйте функцию `cube` с сигнатурой `cube(x: number): number`
вычисляющую куб своего аргумента.
- Вызовите функции `square` и `cube` в цикле от 0 до 9, вычисляя, соответственно
квадрат и куб от переменной цикла. Передайте квадрат и куб на каждой итерации в
функцию `average`. Результаты сложите в массив и возвратите из функции
`calculate`.

```
    import java.util.Scanner; // импортируем с библиотеки java

    public class Main {

        Scanner scan = new Scanner(System.in); // используем Scanner
        System.out.println("Введите первое число... "); // выводим в консоль вопрос пользователю 
        int numX = scan.nextInt(); // присваиваем ответ пользователя 

        int squareValue = Taschenrechner.square(numX); // присваиваем функции значение 
        int cubeValue = Taschenrechner.cube(numX);
        double averageValue = Taschenrechner.average(squareValue, cubeValue);

        System.out.println("Среднее арифметическое между квадратом и кубом: " + averageValue);

        scan.close(); // закрываем Scanner
    }
```
```
    // детский класс 
    public class Taschenrechner {

        // создаем функции, для родительского класса

        public static int square(int numX) {
            int result = numX * numX; 
            System.out.println("Ваше число в квадрате: " + result); // выводим в консоль
            return result; // возвращаем результат 
        }

        public static int cube(int numX) {
            int result = numX * numX * numX;
            System.out.println("Ваше число в кубе: " + result);
            return result;
        }

        public static double average(int numA, int numB) {
            return (numA + numB) / 2.0;
        }
    }

}

```



