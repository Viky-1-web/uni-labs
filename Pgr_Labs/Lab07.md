# 👾 Lab07: Working with Array methods

1. Реализуйте функцию `removeElement(array, item)` для удаления элемента `item`
из массива `array`

2. Улучшите функцию из предыдущего задания для удаления нескольких элементов из
массива `removeElements(array, item1, ... itemN)`

3. Функция `unique(array)` должна возвращать новый массив, не содержащий
дубликатов.

4. Функция `difference(array1, array2)` должна находить разницу между
массивами, т.е. возвращать новый массив, содержащий значения, которые
содержались в `array1`, но не содержались в `array2`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayAufgabe {
    public static void main(String[] args) {
        var arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(arr));

        // 1 (удаление элемента с массива)
        int idx = 2;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idx) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("1. " + Arrays.toString(newArr)); // [1, 2, 4, 5, 6, 7]

        // 2 (удаление нескольких элементов)
        Set<Integer> removeElements = new HashSet<>(Arrays.asList(1, 3, 5));

        int[] newArr2 = new int[arr.length - removeElements.size()];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!removeElements.contains(i)) {
                newArr2[j++] = arr[i];
            }
        }

        System.out.println("2. " + Arrays.toString(newArr2)); // [1, 3, 5, 7]

        // 3 (возвращение массива без дубликатов)
        int[] Arr = { 1, 2, 3, 4, 5, 1, 2 };

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArr = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            uniqueArr[i++] = num;
        }

        System.out.println("3. " + Arrays.toString(uniqueArr)); // [1, 2, 3, 4, 5, 6, 7]

        // 4 (возвращение элементов, которые содержалить только в первом массиве)
        int[] Arr1 = { 7, -2, 10, 5, 0 };
        int[] Arr2 = { 0, 10 };
        

    }

} 
```


```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(arr));

        // 1
        int idx = 2;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idx) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("1. " + Arrays.toString(newArr)); // [1, 2, 4, 5, 6, 7]

        // 2
        Set<Integer> removeElements = new HashSet<>(Arrays.asList(1, 3, 5));

        int[] newArr2 = new int[arr.length - removeElements.size()];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!removeElements.contains(i)) {
                newArr2[j++] = arr[i];
            }
        }

        System.out.println("2. " + Arrays.toString(newArr2)); //

        // 3
        int[] Arr = { 1, 2, 3, 4, 5, 1, 2 };

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArr = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            uniqueArr[i++] = num;
        }

        System.out.println("3. " + Arrays.toString(uniqueArr)); // [1, 2, 3, 4, 5, 6, 7]

    }

}
```
