#  👾 Lab04
## ✔️ Итерирование циклами

Реализуйте функцию `sum(...args)`, которая суммирует все свои аргументы, пятью
разными способами. Примеры вызовов с результатами:
```js
const a = sum(1, 2, 3) // a === 6
const b = sum(0) // b === 0
const c = sum() // c === 0
const d = sum(1, -1, 1) // d === 1
const e = sum(10, -1, -1, -1) // e === 7
```

1. Цикл `for`
2. Цикл `for..of`
3. Цикл `while`
4. Цикл `do..while`
5. Метод `Array.prototype.reduce()`

```java
import java.util.Arrays;

public class Lab04 {
    public static int main(String[] args) {
        int sum = 0;
        //for
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;

        //for-each
        for(int num : args){
            sum += num;
        }
        return sum;

        //while
        int sum = 0;
        int i = 0;
        while (i < args.length) {
            sum += Integer.parseInt(args[i]);
            i++;
        }
        return sum;

        //do..while
        int sum = 0;
        int i = 0;
        do{
            sum += args[i];
            i++;
        }
        while(i < args.length){
            return  sum;
        }

        //на подобии метода Array.prototype.reduce()
        int[] arr = {1, 2, 3, 4};

        int sum = Arrays.stream(arr)
                .reduce(0, (acc, val) -> acc + val);

        int sum = 0;
    }
}
```
