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

##Tools
- Kotlin REPL
