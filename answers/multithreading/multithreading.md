## Многопоточность


- <a href="">Чем отличается процесс от потока?</a> 
- <a href="">Каким образом можно создать поток?</a> 
- <a href="">Что такое монитор?</a> 
- <a href="">Какие способы синхронизации в Java?</a> 
- <a href="">Как работают методы wait и notify/notifyAll?</a> 
- <a href="">Чем отличается работа метода wait с параметром и без параметра?</a> 
- <a href="">Как работает метод Thread.yield()? Чем отличаются методы Thread.sleep() и Thread.yield()?</a> 
- <a href="">Как работает метод Thread.join()?</a> 
- <a href="">Что такое dead lock?</a> 
- <a href="">На каком объекте происходит синхронизация при вызове static synchronized метода?</a> 
- <a href="">Для чего используется ключевое слово volatile, synchronized, transient, native?</a> 
- <a href="">Что значит приоритет потока?</a> 
- <a href="">Что такое потоки демоны в джава?</a> 
- <a href="">Что значит усыпить поток?</a> 
- <a href="">В каких состояниях может быть поток в джава? Как вообще работает поток?</a> 
- <a href="">Чем отличаются два интерфейса для реализации задач Runnable и Callable?</a> 
- <a href="">Различия между CyclicBarrier и CountDownLatch?</a> 
- <a href="">Что такое состояние гонки (race condition)?</a> 
- <a href="">Как остановить нить?</a> 
- <a href="">Что происходит, когда в нити появляется исключение?</a> 
- <a href="">Что такое ThreadLocal переменная?</a> 
- <a href="">Что такое FutureTask?</a> 
- <a href="">Различие между interrupted и isInterrupted?</a> 
- <a href="">Почему методы wait и notify вызываются в синхронизированном блоке?</a> 
- <a href="">Что такое пул нитей?</a> 
- <a href="">Различия между livelock и deadlock?</a> 
- <a href="">Как проверить, удерживает ли нить lock?</a> 
- <a href="">Как получить дамп нити?</a> 
- <a href="">Какой JVM параметр используется для контроля размера стека нити?</a> 
- <a href="">Различия между synchronized и ReentrantLock?</a> 
- <a href="">Что такое Semaphore?</a> 
- <a href="">Что будет, если очередь пула нитей уже заполнена, а вы подадите задачу?</a> 
- <a href="">Различия между методами submit() и execute() у пула нитей?</a> 
- <a href="">Что такое блокирующий метод?</a> 
- <a href="">Что такое ReadWriteLock</a>
- <a href="">Что такое double checked locking Синглтона?</a>
- <a href="">Что такое фреймворк Fork/Join?</a>

### С сайта javastudy

- <a href="dajte_opredelenie_ponyatiyu_process.md">Дайте определение понятию “процесс”.</a>
- <a href="dajte_opredelenie_ponyatiyu_potok.md">Дайте определение понятию “поток”.</a>
- <a href="dajte_opredelenie_ponyatiyu_sinxronizaciya_potokov.md">Дайте определение понятию “синхронизация потоков”.</a>
- <a href="kak_vzaimodejstvuyut_programmy,_processy_i_potoki.md">Как взаимодействуют программы, процессы и потоки?</a>
- <a href="v_kakix_sluchayax_celesoobrazno_sozdavat_neskolko_potokov.md">В каких случаях целесообразно создавать несколько потоков?</a>
- <a href="chto_mozhet_proizojti_esli_dva_potoka_budut_vypolnyat_odin_i_tot_zhe_kod_v_programme.md">Что может произойти если два потока будут выполнять один и тот же код в программе?</a>
- <a href="chto_vy_znaete_o_glavnom_potoke_programmy.md">Что вы знаете о главном потоке программы?</a>
- <a href="kakie_est_sposoby_sozdaniya_i_zapuska_potokov.md">Какие есть способы создания и запуска потоков?</a>
- <a href="kakoj_metod_zapuskaet_potok_na_vypolnenie.md">Какой метод запускает поток на выполнение?</a>
- <a href="kakoj_metod_opisyvaet_dejstvie_potoka_vo_vremya_vypolneniya.md">Какой метод описывает действие потока во время выполнения?</a>
- <a href="kogda_potok_zavershaet_svoe_vypolnenie.md">Когда поток завершает свое выполнение?</a>
- <a href="kak_sinxronizirovat_metod.md">Как синхронизировать метод?</a>




- <a href="">Как принудительно остановить поток?</a>
- <a href="">Дайте определение понятию “поток-демон”.</a>
- <a href="">Как создать поток-демон?</a>
- <a href="">Как получить текущий поток?</a>
- <a href="">Дайте определение понятию “монитор”.</a>
- <a href="">Как приостановить выполнение потока?</a>
- <a href="">В каких состояниях может пребывать поток?</a>
- <a href="">Что является монитором при вызове нестатического и статического метода?</a>
- <a href="">Что является монитором при выполнении участка кода метода?</a>
- <a href="">Какие методы позволяют синхронизировать выполнение потоков?</a>
- <a href="">Какой метод переводит поток в режим ожидания?</a>
- <a href="">Какова функциональность методов notify и notifyAll?</a>
- <a href="">Что позволяет сделать метод join?</a>
- <a href="">Каковы условия вызова метода wait/notify?</a>
- <a href="">Дайте определение понятию “взаимная блокировка”.</a>
- <a href="">Чем отличаются методы interrupt, interrupted, isInterrupted?</a>
- <a href="">В каком случае будет выброшено исключение InterruptedException, какие методы могут его выбросить?</a>
- <a href="">Модификаторы volatile и метод yield().</a>
- <a href="">Пакет java.util.concurrent</a>
- <a href="">Есть некоторый метод, который исполняет операцию i++. Переменная i типа int. Предполагается, что код будет исполнятся в многопоточной среде. Следует ли синхронизировать блок?</a>
- <a href="">Что используется в качестве mutex, если метод объявлен static synchronized? Можно ли создавать новые экземпляры класса, пока выполняется static synchronized метод?</a>
- <a href="">Предположим в методе run возник RuntimeException, который не был пойман. Что случится с потоком? Есть ли способ узнать о том, что Exception произошел (не заключая все тело run в блок try-catch)? Есть ли способ восстановить работу потока после того как это произошло?</a>
- <a href="">Какие стандартные инструменты Java вы бы использовали для реализации пула потоков?</a>
- <a href="">Что такое ThreadGroup и зачем он нужен?</a>
- <a href="">Что такое ThreadPool и зачем он нужен?</a>
- <a href="">Что такое ThreadPoolExecutor и зачем он нужен?</a>
- <a href="">Что такое «атомарные типы» в Java?</a>
- <a href="">Зачем нужен класс ThreadLocal?</a>
- <a href="">Что такое Executor?</a>
- <a href="">Что такое ExecutorService?</a>
- <a href="">Зачем нужен ScheduledExecutorService?</a>
