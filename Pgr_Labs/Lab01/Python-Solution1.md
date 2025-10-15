# 👾 Lab01: Scalar value vs Reference & Type Counting - Python Solution

## ✔️ Task 1: Hoisting
1. Напишите функцию, содержащую внутри себя переменную с поднятием.

- Опубликуйте пример с функцией на github.
- Используйте eslint, для поиска проблем в коде.
- При необходимости исправьте пример и отправьте изменения на github.

```py 
print("Welch Zahl: ")
val = int(input())

def myfunc():
    global val
    val += 1
    return val

def main():
    myfunc()
    print("1: ", val)

main()
```
## ✔️ Task 2: Scalar value vs Reference
2. C сигнатурой `inc(n: number): number`,
пример вызова: `const a = 5; const b = inc(a); console.dir({ a, b });`
3. C сигнатурой `inc(num: Num)`, где `Num` является объектом с полем `n`,
чтобы функция изменила поле исходного объекта переданного по ссылке,
пример вызова `const obj = { n: 5 }; inc(obj); console.dir(obj);`

```py 
def inc(zahl):
    return zahl + 1

a = 5
b = inc(a)

def myfunc():
    print("2: ", {'a': a, 'b': b})

myfunc()
```
## ✔️ Task 3: Type Counting
4. Подсчет элементов различных типов в массиве.

- Создайте исходный массив, содержащий значения различных типов, в качестве
элементов, например: `[true, 'hello', 5, 12, -200, false, false, 'word']`
но желательно более длинный и разнообразный.
- Создайте объект-коллекцию (хеш) с именами типов в виде ключей и `0` в качестве
значения, например: `{ number: 0, string: 0, boolean: 0 }`
- Пройдитесь по массиву циклом `for..of` и для каждого элемента массива,
увеличивайте соответствующее значение в объекте-коллекции.
- Измените пример: удалите все ключи из начальной коллекции и добавляйте их
динамически в цикле.

```py 
arr = {True, 'hello', 5, 12, -200, False, False, 'word'}
new_arr = {}

for x in arr:
    a = type(x).__name__

    if a not in new_arr:
        new_arr[a] = 0

    new_arr[a] += 1

print("3:", new_arr)
```



