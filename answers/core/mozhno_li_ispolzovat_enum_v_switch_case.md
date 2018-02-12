Да, вы можете.
Мало того, это одна из главных полезностей использования Enum.
Поскольку экземпляры Enum компилируют временную константу, вы можете без опаски внедрять их внутрь case и switch.
Вот например код с днями недели:

```java
class Main {
    public void developerState(DayOfWeek today){
            switch(today){
                case MONDAY:
                    System.out.println("Hmmmmmmmm");
                    break;
                case TUESDAY:
                    System.out.println("Hmmmm");
                    break;
                case FRIDAY :
                    System.out.println("Yeahhhhhh");
                    break;
            }     
    }
}
```
Enum и Switch отлично дополняют друг друга, в особенности если Enum содержит небольшое количество устойчивых констант, например, семь дней недели, 12 месяцев года и т. д.