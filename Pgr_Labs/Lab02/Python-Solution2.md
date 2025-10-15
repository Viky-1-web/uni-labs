#  👾 Lab02: Identifiers, Loops, Functions, Objects & Collections
## ✔️ Identifiers
1. Объявите переменную и запишите в нее свое имя как литерал строки.
2. Объявите константу и запишите в нее год своего рождения как литерал числа.
3. Создайте функцию, которая печатает приветствие и имеет один аргумент: `name`.

```py 
print("#1")
my_name = "Viky"
birth_year = 2008
print("Ich heiße ", my_name)
print("  ")
```
## ✔️ Loops

4. Реализуйте функцию `range(start: number, end: number): array` которая отдает
массив чисел из диапазона [15, 30] включая крайние числа.
5. Реализуйте функцию `rangeOdd(start: number, end: number): array` которая
отдает массив нечетных чисел из диапазона [15, 30] включая крайние числа.

```py 
print("#2")
start = 15
end = 30

def range_all(start, end):
    return list(range(start, end+1))

def range_odd (start, end):
    new_arr = []
    for x in range(start, end + 1):
        if x % 2 == 0:
            new_arr.append(x)
    return new_arr

print("Alle zahlen:", range_all(start, end))
print("Jader zweiter zahl: ", range_odd(start, end))
print("  ")
```
## ✔️ Functions

6. Вложенные вызовы функций в цикле
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

```py 
print("#3")
print("Bitte tippen Sie die Nummer ein..")
numX = int(input())

square = numX * numX
cube = numX * numX * numX

calculate = (square, cube) / 2

print("Antwort", calculate)
print("  ")
```
## ✔️ Objects

7. Выполнить следующие пункты внутри функции `fn` (см. заготовку: `7-objects.js`)
- Создайте объект с одним полем `name` и присвойте его в константу.
- Создайте объект с одним полем `name` и присвойте его в переменную.
- Попробуйте поменять поле `name` у обоих объектов.
- Попробуйте присвоить другой объект в оба идентификатора.
- Объясните поведение кода и оставьте только рабочий код.
8. Реализуйте функцию `createUser` с сигнатурой
`createUser(name: string, city: string): object`. Пример вызова:
`createUser('Marcus Aurelius', 'Roma')` функция должна вернуть объект
`{ name: 'Marcus Aurelius', city: 'Roma' }`

```py 
print("#4")
def fn():
    obj = {"name": "Viky"}
    obj_2 = {"name": "Daria"}

    print("1:")
    print("obj", obj)
    print("obj_2", obj_2)
    print("  ")

    obj["name"] = "V"
    obj_2["name"] = "D"

    print("2:")
    print("obj", obj)
    print("obj_2", obj_2)
    print("  ")

    obj = {"name": "Mary"}
    obj_2 = {"name": "Frank"}

fn()
```
## ✔️ Collections: Array, Hash (Object)


9. Реализуйте телефонную книгу на массиве объектов.
- Объявите массив объектов с двумя полями: `name` и `phone` для хранения
телефонной книги. Пример объекта:
`{ name: 'Marcus Aurelius', phone: '+380445554433' }` и добавьте несколько
объектов в массив, чтоб было на чем проверять.
- Реализуйте функцию `findPhoneByName` с сигнатурой
`findPhoneByName(name: string): string`. При вызове функция должна находить
объект, где поле `name` равно аргументу `name` и возвращать номер телефона из
объекта. Для поиска воспользуйтесь циклом `for`.
A. Реализуйте телефонную книгу на хеш-таблицах, т.е. справочниках (объектах).
- Задайте справочник (объект) с ключами равными значениям поля `name` (из
предыдущего примера) и значениями равными полю `phone`.
- Реализуйте функцию `findPhoneByName` с сигнатурой
`findPhoneByName(name: string): string` которая находит телефон в хеше по имени
и возвращает номер телефона. Используйте `hash[key]` для поиска телефона.

```py 
print("#5")
def user():
    name = 'Marcus Aurelius'
    city = 'Roma'

    global createUser
    createUser = (name, city)

user()
print(createUser)
print("  ")

print("#6")
def Book():
    phone = '+380445554433'
    createUser2 = (phone,)

    user()
    tupl = createUser + createUser2
    print(tupl)
    print("  ")
```

