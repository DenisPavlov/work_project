# Kotlin helper

## Компиляция кода

- kotlinc <исходный файл или каталог> -include-runtime -d <имя jar файла>
- java -jar <имя jar файла>

## Синтаксис
- <code>e as Num</code> - явное приведение типа
- <code>is</code> - определяется принадлежность к определенному типу
- <code>val oneToTen = 1..10</code> - диапазон

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

````kotlin
val regexp =  "\\.|-".toRegex()
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

- объявление объекта одиночки(singleton)
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

### Работа с null
- оператор безопасного вызова - <code>?.</code> Следующие выражения эквивалентны
````kotlin
val allCaps: String? = s?.toUpperCase()
val allCaps: String? = if(s != null) s.toUpperCase() else null
````

- оператор элвис (замена null дефолтным знаением) - <code>?:</code>
````kotlin
fun strLenSafe(s: String?): Int = s?.length ?: 0
 ````
- безопасное приведение типов **as?**
````kotlin
a as? String
if(a is String) a as String else null 
````
- преобразует любое значение к не null типу - <code>!!</code> Чтобы было выбрашено исключение не нужно даже обращаться к
переменной. В примере будет: <code>kotlin.KotlinNullPointerException</code>
````kotlin
val a: String? = null
val b: String = a!!
````

### Специальные функции
- **let** - Вызывает заданную функцию [block] со значением `this` в качестве аргумента и возвращает результат. 
Превращает объект вызова в параметр лямбда выражения. Позволяет вычеслить выражение, проверить его на null и сохранить 
его в переменной. Чаще всего используется для передачи аргумента который м.б. равен null в не null параметр.
````kotlin
 fun sendEmailTo(email: String) {
     println("Sending email to $email")
 }
 
 fun main() {
     var email: String? = "yole@example.com"
     email?.let { sendEmailTo(it) }
     email = null
     email?.let { sendEmailTo(it) }
     
     //эквивалентно
     if(email != null) sendEmail(email)
 }
````
 - **with** - Вызывает определённую функцию [block] с данным [receiver] в качестве своего получателя и возвращает 
 результат. Позволяет выполнить несколько операций над одним объектом, не повторяя его имени. Функция возвращает 
 результат последнего выражения в теле лямбда-выражения.
````kotlin
// выводим все буквы алфавита
fun printAlphabet() = with(StringBuilder()){
    for (letter in 'A'..'Z'){
        append(letter)
    }
    toString()
} 
````
- **apply** - Вызывает определённую функцию [block] со значением `this` в качестве своего получателя и возвращает 
значение `this`. Полезна в тех случаях, когда требуется создание экземпляра, у которого следует инициализировать 
некоторые свойства. 
````kotlin
val button = findViewById<Button>(R.id.button)
button.text = "I am a button"
button.textSize =18.0F
button.setBackgroundColor(Color.RED)

//эквивалент через apply

val button = findViewById<Button>(R.id.button)
button.apply{
    text = "I am a button"
    textSize = 18.0F
    setBackgroundColor(Color.RED)
}
````
- **also** - Метод для обмена значениями между двумя переменными без участия третьей переменной.
````kotlin
var x = 100
var y = 25
x = y.also { y = x }

class Cat(var age: Int)
val result = Cat(5).also { it.age = 8 }
println(result.age) // 8
````
- **run** - Вызывает функцию, которая передается как параметр
````kotlin
fun testCat() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad
}
````
- **run** - Вызывает определённую функцию [block] со значением `this` в качестве получателя и возвращает результат. 
Она определена как функция-расширение типа, чей экземпляр затем передаётся в качестве получателя и возвращает результат 
исполнения функции block.
````kotlin
val layout = LayoutStyle()
layout.run { orientation = SharedState.previousOrientation } // returns Unit
````

### Создание коллекций

````kotlin
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
````

Тип коллекции | Только для чтения | Изменяемая коллекция
--- | --- | ---
`List` | `listOf` | `mutableListOf`, `arrayListOf` 
`Set` | `setOf` | `mutableSetOf`, `hashSetOf`, `linkedSetOf`, `sortedSettOf`
`Map` | `mapOf` | `mutableMapOf`, `hashMapOf`, `linkedMapOf`, `sortedMapOf`

### Перегрузка операторов

Выражение | Имя функции
--- | --- 
`a * b` | `times`  
`a / b` | `div` 
`a % b` | `mod` 
`a + b` | `plus` 
`a - b` | `minus` 

## Tools
- Kotlin REPL
