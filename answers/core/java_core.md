## Java Core

### Ключевые слова
- <a href="http://www.quizful.net/interview/java/access-modifiers">Какие бывают области видимости (модификаторы доступа) у переменных и методов? И каким образом модификатор доступа можно изменять в наследниках класса?</a>

### Class
- <a href="kakie_metody_est_u_klassa_object.md">Какие методы есть у класса Object?</a>
- <a href="kakie_sushhestvuyut_tipy_vlozhennyx_klassov.md">Какие существуют типы вложенных классов? Для чего они используются?</a>

### Methods
- <a href="vozmozhno_li_pri_pereopredelenii_(override)_metoda_izmenit.md">Возможно ли при переопределении (override) метода изменить:
    1) Модификатор доступа
    2) Возвращаемый тип
    3) Тип аргумента или количество
    4) Имя аргументов
    5) Изменять порядок, количество или вовсе убрать секцию throws?</a>
- <a href="kakim_obrazom_peredayutsya_peremennye_v_metody,_po_znacheniyu_ili_po_ssylke.md">Каким образом передаются переменные в методы, по значению или по ссылке?</a>
- <a href="kak_peredayutsya_klassy_obertki_v_metody_(integer,_double...).md">Как передаются классы обертки в методы?(Integer, Double...)</a>

#### hashCode(), equals()
- <a href="pravila_pereopredeleniya_metoda_object.equals().md">Правила переопределения метода Object.equals().</a>
- <a href="esli_vy_xotite_pereopredelit_equals(),_kakie_usloviya_dolzhny_udovletvoryatsya_dlya_pereopredelennogo_metoda.md">Если вы хотите переопределить equals(), какие условия должны удовлетворяться для переопределенного метода?</a>
- <a href="kakaya_svyaz_mezhdu_hashcode_i_equals.md">Какая связь между hashCode и equals?</a>
- <a href="kakim_obrazom_realizovany_metody_hashcode_i_equals_v_klasse_object.md">Каким образом реализованы методы hashCode и equals в классе Object?</a>
- <a href="chto_budet,_esli_pereopredelit_equals_ne_pereopredelyaya_hashcode.md">Что будет, если переопределить equals не переопределяя hashCode? Какие могут возникнуть проблемы?</a>
- <a href="est_li_kakie-libo_rekomendacii_o_tom,_kakie_polya_sleduet_ispolzovat_pri_podschete_hashcode.md">Есть ли какие-либо рекомендации о том, какие поля следует использовать при подсчете hashCode?</a>
- <a href="dlya_chego_nuzhen_metod_hashcode.md">Для чего нужен метод hashCode()?</a>
- <a href="pravila_pereopredeleniya_metoda_object.hashcode.md">Правила переопределения метода Object.hashCode().</a> 

### Типы данных
- <a href="chto_takoe_autoboxing.md">Что такое autoboxing?</a> 

### Generics
- <a href="chto_takoe_generics.md">Что такое Generics?</a>
- <a href="kakova_istinnaya_cel_ispolzovaniya_obobshhennyx_tipov_v_java.md">Какова истинная цель использования обобщенных типов в Java?</a>

### Enum
- <a href="mozhet_li_enum_nasledovat_(implement)_interfejs_v_java.md">Может ли Enum наследовать (implement) интерфейс в Java?</a>
- <a href="mozhet_li_enum_nasledovat_(extends)_klass.md">Может ли Enum наследовать (extends) класс?</a>
- <a href="kak_sozdat_enum_bez_ekzemplyarov_obektov.md">Как создать Enum без экземпляров объектов? Возможно ли это без ошибки компиляции?</a>
- <a href="mozhem_li_my_pereopredelit_metod_tostring()_dlya_enum.md">Можем ли мы переопределить метод toString() для Enum? Что будет, если не будем переопределять?</a>
- <a href="mozhem_li_my_sozdat_ekzemplyar_enum_vne_enum.md">Можем ли мы создать экземпляр Enum вне Enum? Почему нет?</a>
- <a href="mozhem_li_my_ukazat_konstruktor_vnutri_enum.md">Можем ли мы указать конструктор внутри Enum?</a>
- <a href="kakaya_raznica_sravnivat_enum_pri_pomoshhi_==_ili_metoda_equals().md">Какая разница сравнивать Enum при помощи == или метода equals()?</a>
- <a href="chto_delaet_metod_ordinal()_v_enum.md">Что делает метод ordinal() в Enum?</a>
- <a href="mozhno_ispolzovat_enum_s_treeset_ili_treemap_v_java.md">Можно использовать Enum с TreeSet или TreeMap в Java?</a>
- <a href="kakaya_raznica_mezhdu_ordinal()_i_compareto()_v_enum.md">Какая разница между ordinal() и compareTo() в Enum?</a>
- <a href="mozhno_li_ispolzovat_enum_v_switch_case.md">Можно ли использовать Enum в switch case?</a>
- <a href="kak_projtis_po_vsemu_ekzemplyaru_enum.md">Как пройтись по всему экземпляру Enum?</a>
- <a href="kakie_plyusy_i_minusy_ispolzovaniya_enum_v_kachestve_singltona.md">Какие плюсы и минусы использования Enum в качестве синглтона</a>
- <a href="kakaya_vygoda_ispolzovat_enum_vmesto_patternov_perechisleniya_int_i_perechisleniya_string.md">Какая выгода использовать Enum вместо паттернов перечисления int и перечисления String?</a>
- <a href="kak_preobrazovat_string_v_enum.md">Как преобразовать String в Enum?</a>

### Exceptions

### String, StringBuilder, StringBuffer

### Не разобранное

- <a href="%D0%A7%D0%B5%D0%BC%20%D0%BE%D1%82%D0%BB%D0%B8%D1%87%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20JRE%2C%20JVM%2C%20JDK.md">Чем отличается JRE, JVM и JDK</a>
- <a href="%D0%9E%D0%BF%D0%B8%D1%88%D0%B8%D1%82%D0%B5%20%D0%BC%D0%BE%D0%B4%D0%B8%D1%84%D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D1%80%D1%8B%20%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%D0%B0%D0%B2%20Java.md">Опишите модификаторы доступав Java</a>
- <a href="%D0%A7%D1%82%D0%BE%20%D1%82%D0%B0%D0%BA%D0%BE%D0%B5%20package%20level%20access.md">Что такое package level access</a>
- <a href="%D0%A7%D0%B5%D0%BC%20%D0%B0%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D1%8B%D0%B9%20%D0%BA%D0%BB%D0%B0%D1%81%D1%81%20%D0%BE%D1%82%D0%BB%D0%B8%D1%87%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%D0%BE%D1%82%20%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D0%B0.md">Чем абстрактный класс отличается от интерфейса? В каких случаях Вы бы использовали абстрактный класс, а в каких интерфейс?</a>
- <a href="mozhet_li_obekt_poluchit_dostup_k_private_peremennoj_klassa?_esli_da,_to_kakim_obrazom?.md">Может ли объект получить доступ к private переменной класса? Если да, то каким образом?</a> 
- <a href="dlya_chego_v_java_staticheskie_bloki.md">Для чего в джаве статические блоки?</a> 
- <a href="mozhno_li_peregruzit_static_metod.md">Можно ли перегрузить, переопределить static метод?</a> 
- <a href="rasskazhite_pro_vnutrennie_klassy._kogda_vy_ix_budete_ispolzovat.md">Расскажите про внутренние классы. Когда вы их будете использовать?</a> 
- <a href="v_chem_raznica_mezhdu_peremennoj_ekzemplyara_i_staticheskoj_peremennoj_privedite_primer.md">В чем разница между переменной экземпляра и статической переменной? Приведите пример.</a> 
- <a href="privedite_primer_kogda_mozhno_ispolzovat_staticheskij_metod.md">Приведите пример когда можно использовать статический метод?</a> 
- <a href="rasskazhite_pro_klassy_zagruzchiki_i_pro_dinamicheskuyu_zaruzku_klassov.md">Расскажите про классы- загрузчики и про динамическую зарузку классов.</a> 
- <a href="kak_vedut_sebya_static_polya_pri_serrializacii.md">Как ведут себя static поля при серриализации</a>
- <a href="chto_takoe_staticheskaya_i_chto_takoe_dinamicheskaya_zagruzka_klassa.md">Что такое статическая и что такое динамическая загрузка класса?</a> 
- <a href="dlya_chego_nuzhen_operator_assert_v_dzhava.md">Для чего нужен оператор "assert" в джава?</a> 
- <a href="pochemu_v_nekotoryx_interfejsax_voobshhe_ne_opredelyayut_metodov.md">Почему в некоторых интерфейсах вообще не определяют методов?</a> 
- <a href="kakaya_osnovnaya_raznica_mezhdu_string_stringbuffer_stringbuilder.md">Какая основная разница между String, StringBuffer, StringBuilder?</a> 
- <a href="rasskazhite_pro_potoki_vvoda-vyvoda_java.md">Расскажите про потоки ввода-вывода Java</a> 
- <a href="chto_takoe_heap_i_stack_pamyat_v_java.md">Что такое Heap и Stack память в Java?</a>
- <a href="kakaya_raznica_mezhdu_stack_i_heap_pamyatyu_v_java.md">Какая разница между Stack и Heap памятью в Java?</a>
- <a href="rasskazhite_pro_model_pamyati_v_java.md">Расскажите про модель памяти в джава?</a>
- <a href="kak_rabotaet_sborshhik_musora.md">Как работает сборщик мусора (garbage collector)?</a>
- <a href="rasskazhite_pro_privedenie_tipov.md">Расскажите про приведение типов. Что такое понижение и повышение типа? Когда вы получаете ClassCastException?</a>
- <a href="chto_takoe_staticheskij_klass,_kakie_osobennosti_ego_ispolzovaniya.md">Что такое статический класс, какие особенности его использования?</a>
- <a href="kakim_obrazom_iz_vlozhennogo_klassa_poluchit_dostup_k_polyu_vneshnego_klassa.md">Каким образом из вложенного класса получить доступ к полю внешнего класса.</a>

Остановился
-

 
 

- <a href="">Расскажите про клонирование объектов. В чем отличие между поверхностным и глубоким клонированием?</a> 
- <a href="">Правила переопределения метода Object.clone().</a> 
- <a href="">Где и как вы можете использовать закрытый конструктор?</a> 
- <a href="">Что такое конструктор по умолчанию?</a> 
- <a href="">Опишите метод Object.finalize().</a> 
- <a href="">Чем отличаются слова final, finally и finalize?</a> 
- <a href="">Опишите иерархию исключений.</a> 
- <a href="">Какие виды исключений в Java вы знаете, чем они отличаются?</a> 
- <a href="">Что такое checked и unchecked Exception?</a> 
- <a href="">Как создать свой unchecked Exception?</a> 
- <a href="">Какие есть Unchecke exeption?</a> 
- <a href="">Что такое Error?</a> 
- <a href="">Опишите работу блока try-catch-finally.</a> 
- <a href="">Возможно ли использование блока try-finally (без catch)?</a> 
- <a href="">Всегда ли исполняется блок finally?</a> 
- <a href="">Какие есть оссобенности класса String? что делает метод intern().</a> 
- <a href="">Можно ли наследовать строковый тип, почему?</a> 
- <a href="">Почему строка является популярным ключом в HashMap в Java?</a> 
- <a href="">Дайте определение понятию конкатенация строк.</a> 
- <a href="">Как перевернуть строку?</a> 
- <a href="">Как сравнить значение двух строк?</a> 
- <a href="">Как обрезать пробелы в начале и конце строки?</a> 
- <a href="">Дайте определение понятию "пул строк".</a> 
- <a href="">Можно ли синхронизировать доступ к строке?</a> 
- <a href="">Как правильно сравнить значения строк двух различных объектов типа String и StringBuffer?</a> 
- <a href="">Почему строка неизменная и финализированная в Java?</a> 
- <a href="">Напишите метод удаления данного символа из строки.</a> 
- <a href="">Что такое рефлексия?</a> 
- <a href="">Что произойдет со сборщиком мусора (GC), если во время выполнения метода finalize() некоторого объекта произойдет исключение?</a> 
- <a href="">Что такое интернационализация, локализация?</a> 
- <a href="">Что такое Аннотации в Java?</a> 
- <a href="">Какие функции выполняет Аннотации?</a> 
- <a href="">Какие встроенные аннотации в Java вы знаете?</a> 
- <a href="">Что делают аннотации @Retention, @Documented, @Target и @Inherited?</a> 
- <a href="">Что делают аннотации @Override, @Deprecated, @SafeVarargs и @SuppressWarnings?</a> 
- <a href="">Какой жизненный цикл аннотации можно указать с помощью @Retention?</a> 
- <a href="">К каким элементам можно применять аннотацию, как это указать?</a> 
- <a href="">Как создать свою Аннотацию?</a> 
- <a href="">Атрибуты каких типов допустимы в аннотациях?</a> 
- <a href="">Что такое JMX?</a> 
- <a href="">Какие выгоды предлагает JMX?</a> 
- <a href="">Что еще умеет JMX кроме дистанционного управления?</a> 
- <a href="">Что такое MBean?</a> 
- <a href="">Какие типы MBeans существуют?</a> 
- <a href="">Что такое MBean Server?</a> 
- <a href="">Какие механизмы обеспечивают безопасность в технологии Java?</a> 
- <a href="">Назовите несколько видов проверок которые выполняет верификатор байт-кода Java?</a> 
- <a href="">Что вы знаете о "диспетчере защиты" в Java?</a> 
- <a href="">Что такое JAAS?</a> 
- <a href="">Что такое Рефакторинг?</a> 