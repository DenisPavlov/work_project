Если в дочернем потоке упадет <code>Exception</code>, то метод <code>run()</code> аварийно завершится и исключение будет передано в главный поток. 
Далее в консоль будет выведен стектрейс, приведенный ниже.

    Exception in thread "Thread-0" java.lang.NullPointerException
    Thread-0
    	at ru.javastudy.interview.multithreading.JoinClass.exceptionChecker(JoinClass.java:101)
    	at ru.javastudy.interview.multithreading.JoinClass.run(JoinClass.java:24)
    	at java.lang.Thread.run(Thread.java:745)
