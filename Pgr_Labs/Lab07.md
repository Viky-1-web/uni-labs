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

        // 1
        int indexToRemove = 2;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("1. " + Arrays.toString(newArr)); // [1, 2, 4, 5, 6, 7]

        // 2
        Set<Integer> indicesToRemove = new HashSet<>(Arrays.asList(1, 3, 5));

        int[] newArr2 = new int[arr.length - indicesToRemove.size()];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!indicesToRemove.contains(i)) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("2. " + Arrays.toString(newArr2)); // [0, 0, 0, 0]

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
