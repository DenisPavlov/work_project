<code>String</code> - неизменяемый класс, тоесть для добавление данных в уже существующую строку, создается новый объект строки.

<code>StringBuffer</code> и <code>StringBuilder</code> могут изменятся и добавление строки не такое дорогостоющее с точки зрения памяти. Первый - синхронизированный, второй - нет. Это их единственное различие.

Правда &nbsp;если нам нужно сделать подстроку &nbsp;строки, то лучше использовать String, так как ее массив символов не меняется и не создается заново для новой строки. А вот в StringBuffer и StringBuilder для создания подстроки создается новый массив символов.