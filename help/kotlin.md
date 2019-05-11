# Kotlin helper

## Компиляция кода

- kotlinc <исходный файл или каталог> -include-runtime -d <имя jar файла>
- java -jar <имя jar файла>

## Синтаксис
- e as Num - явное приведение типа
- is - определяется принадлежность к определенному типу
- val oneToTen = 1..10 - диапазон

- обычный цикл по числам
````Kotlin
for (i in 1..100) {
        print(fizzBuzz(i))
    }
````

- цикл в обратном порядке и только целые числа
````Kotlin
for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
````

- проверить, входит ли значение в диапазое
````Kotlin
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
````

- можно поменять имя импортируемого класса или функции с помощью ключевого слова **as**
````
import string.lastChar as last
````

- вызов с оператором распаковки массива. В этом случае массив args распакуется в отдельные элементы
````
val list = listOf("args: ", *args)
````

- инфиксный вызов метода (обе записи эквивалентны)
````
1.to("one")
1 to "one"

infix fun Any.to(other: Any) = Pair(this, other)
````

- значение объекта Pair можно инициализировать сразу две переменные
````
val(number, name) = 1 to "one"
````

### Создание коллекций
````
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
````

##Tools
- Kotlin REPL
