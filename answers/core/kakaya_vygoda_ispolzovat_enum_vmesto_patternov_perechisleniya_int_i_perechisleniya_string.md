Если вы программируете более 5 лет, и ещё застали JDK 1.3 или 1.4, вы будете на короткой ноге с паттернами перечисления String и int, где используется public static final префикс констант для представления коллекции общеизвестных фиксированных количеств вещей, как Дни Недели.
Тут возникает множество проблем: у вас нет независимости типа Enum, поскольку переменная String отвечающая за день недели может принимать любое произвольное значение.
Точно так же перечисляемый int может принимать любое значение, и компилятор спокойно проглотит это.
А с использованием Enum, вы получаете безопасность типов, которые компилятор проверяет для вас. На эту тему есть несколько интересных мыслей в «Эффективная Java», которую рекомендуется прочитать всем разработчикам на Java.