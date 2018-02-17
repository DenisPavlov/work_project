Или указать в сигнатуре модификатор <code>synchronized</code> или использовать конструкцию <code>synchronized {}</code> внутри метода.

```java
class Main {

    public void swap()
    {
        synchronized (this)
        {
           //someCode
        }
    }
 
    public synchronized void swap1EqualsSwap()
    {
       //someCode
    }
 
    public static synchronized void swap2()
    {
       //someCode
    }
 
    public static void swap3EqualsSwap2()
    {
        synchronized (JoinClass.class)
        {
            //someCode
        }
    }
}
```