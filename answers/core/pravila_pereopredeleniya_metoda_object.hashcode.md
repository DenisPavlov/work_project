При реализации hashCode используется несколько простых правил. 

- Прежде всего, при вычислении хеш-кода следует использовать те же поля, которые сравниваются в equals. Это, во-первых, даст равенство хеш-кодов для равных обектов, во-вторых, распределено полученное значение будет точно так же, как и исходные данные. Теоретически, можно сделать так, чтобы хеш-код всегда был равен 0, и это будет абсолютно легальная реализация. Другое дело, что ее ценность будет равна тому же самому нулю.
- Далее. Несмотря на то, что хеш-коды равных объектов должны быть равны, обратное неверно! Два неравных объекта могут иметь равные хеш-коды. Решающее значение имеет не уникальность, а скорость вычисления, потому как это приходится делать очень часто. Потому, в некоторых случаях имеет смысл посчитать хеш-код заранее и просто выдавать его по запросу. Прежде всего это стоит делать тогда, когда вычисление трудоемко, а объект неизменен.