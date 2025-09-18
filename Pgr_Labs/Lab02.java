#  👾 Lab02: Identifiers, Loops, Functions, Objects & Collections
    ## ✔️ Identifiers
    
```java
public class Lab1 {

    // константа с моим годом рождения
    public static final int birthyear = 2008;

    public static void main(String[] args) {

        // создан массив с единственным аргументом: name
        String myName = "Viktoriia";
        String[] names = { "Maria", "Dascha", "Dami", myName };

        // передвигается по масиву и выводит все значения по очереди
        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя: " + names[i]);
        }
    }
    ```

## ✔️ Loops
    ```
    public class Lab1 {

        int num = 30;

        for (int n = 15; n <= num; n++) {
            System.out.println(n);
        }
    }
    ```
## ✔️ Functions
    ```
    import java.util.Scanner;

    public class Lab1 {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число... ");
        int numA = scan.nextInt();
        System.out.println("Введите второе число... ");
        int numB = scan.nextInt();

        Taschenrechner.average(numA, numB);

        System.out.println("Введите число... ");
        int numX = scan.nextInt();

        Taschenrechner.square(numX);
        Taschenrechner.cube(numX);

        // Taschenrechner.vier(numA, numB);
        scan.close();

    }

    public class Taschenrechner {

        public static void average(int numA, int numB) {
            System.out.println("Среднее арифметическое: " + ((numA + numB) % 2));
        }

        public static void square(int numX) {
            System.out.println("Ваше число в квадрате: " + (numX * numX));
        }

        public static void cube(int numX) {
            System.out.println("Ваше число в кубе: " + (numX * numX * numX));
        }

        /*
        public static void vier(int numA, int numB) {
            System.out.println("...:  " + (***));
        }
        */
    }

}
```
