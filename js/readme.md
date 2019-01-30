Опреаторы
---
- typeof - возвращает тип аргумента (typeof x / typeof(x)). Результатом является строка содержащая тип
- оператор запятая - a = (5, 6); Запятая позволяет перечислять выражения, разделяя их запятой ',' . Каждое из них — вычисляется и отбрасывается, за исключением последнего, которое возвращается.
- +'5' - преобразовывает строку в число
- условие ? значение1 : значение2 - тернарный оператор
- оператор && вычисляет операнды слева направо до первого «ложного» и возвращает его, а если все истинные — то последнее значение
- оператор || вычисляет операнды слева направо до первого «истинного» и возвращает его, а если все истинные — то последнее значение
- оператор ! (НЕ) - приводит аргумент к логическому типу, затем возвращает противоположное значение

Функции
---
- parseInt("11000", 2) — переводит строку с двоичной записью числа в число.
- n.toString(2) — получает для числа n запись в 2-ной системе в виде строки.
- alert(message) - выводит на экран окно с сообщением и приостанавливает выполнение скрипта, пока пользователь не нажмет «ОК».
- prompt(title, default) - выводит модальное окно с заголовком title , полем для ввода текста, заполненным строкой по умолчанию default и кнопками OK/CANCEL. Возвращает введенные посетителем данные.
- confirm(question) - выводит окно с вопросом question с двумя кнопками: OK и CANCEL. Результатом будет true/false.
- - <a href="/js/fetch.md">fetch</a> 

Преобразования типов
---
В JavaScript есть три преобразования:
1. Строковое: String(value) — в строковом контексте или при сложении со строкой. Работает
очевидным образом.
2. Численное: Number(value) — в численном контексте, включая унарный плюс +value . Происходит
при сравнении разных типов, кроме строгого равенства.
3. Логическое: Boolean(value) — в логическом контексте, можно также сделать двойным НЕ:
!!value .

Пометки
---
- Все операторы возвращают значение.
- Число 0 , пустая строка "" , null и undefined , а также NaN являются false
- Опреатор ИЛИ ( || ) возвращает то значение, на котором остановились вычисления
- console.log(n) - пишет n в консоль
 

  var apples = "2";
var oranges = "3";
alert( +apples + +oranges ); // 5, число, оба операнда предварительно преобразованы в числа

Все операторы возвращают значение.

Для проверки равенства без преобразования типов используются операторы строгого
равенства === (тройное равно) и !== .

1. Значения null и undefined равны == друг другу и не равны чему бы то ни было ещё. Это жёсткое
правило буквально прописано в спецификации языка.
2. При преобразовании в число null становится 0 , а undefined становится NaN .

Значения разных типов приводятся к числу при сравнении, за исключением строгого равенства
=== (!== ).

  var apples = "2";
var oranges = "3";
alert( +apples + +oranges ); // 5, число, оба операнда предварительно преобразованы в числа
