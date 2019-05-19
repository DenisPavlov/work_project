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
````kotlin
import string.lastChar as last
````

- вызов с оператором распаковки массива. В этом случае массив args распакуется в отдельные элементы
````kotlin
val list = listOf("args: ", *args)
````

- инфиксный вызов метода (обе записи эквивалентны)
````kotlin
1.to("one")
1 to "one"

infix fun Any.to(other: Any) = Pair(this, other)
````

- значение объекта Pair можно инициализировать сразу две переменные

````kotlin
val(number, name) = 1 to "one"
````

- создание регулярного выражения
````
"\\.|-".toRegex()
````

- тройные кавычки позволяют
    - не экранировать символы
    - многострочный литерал
- если возникает ситуация когда есть два интерфейса с одинаковыми дефолтными методам,
то нужно обязательно переопределить этот метод. 

````kotlin
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff() // можно обратиться к нужному интерфейсу
        super<Focusable>.showOff() // можно обратиться к нужному интерфейсу
    }
}
````
- модификатор видимости <code>internal</code> - видимость в пределах модуля
- модификатор доступа <code>private</code> - видимость в пределах файла

Модификаторы видимости в Kotlin

Модификатор | Член класса | Объявление верхнего уровня
--- | --- | ---
`public`(по умолчанию) | Доступен повсюду | Доступен повсюду
`internal` | Доступен только в модуле | Доступен в модуле
`protected` | Доступен в подклассах | -
`private` | Доступен в классах | Доступен в файле

- обращение к внутреннему классу
````kotlin
class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
````

- ограничение количества наследников
````kotlin
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}
````

- сравнение ссылок на объекты - <code>===</code>

- использование делегатов
````kotlin
class DelegationCollection<T>(
    innerList: ArrayList<T>
) : Collection<T> by innerList {}
````

- объявление объекта одиночки
````kotlin
object Singleton
````

- объект компаньон
````kotlin
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}
````

- объекты выражения (аналог анонимных объектов в Java)
````kotlin
object : MouseAdapter() {
    override fun mouseClicked(e : MouseEvent) {
    //not implement
    }
}
````

### Лямбда выражения

- синтаксис лямбда выражений
````kotlin
{ x: Int, y: Int -> x + y }
````

- ссылка на конструктор
````kotlin
data class Person(val name: String, val age: Int)

fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)
}
````




### Создание коллекций

````kotlin
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
````

##Tools
- Kotlin REPL
