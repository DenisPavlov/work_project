<code>ThreadPoolExecutor</code> — реализация <code>ExecutorService</code>. Он выполняет переданную задачу (Callable или Runnable), используя одну из внутренних доступных нитей из пула. 
Пул потоков содержит в себе <code>ThreadPoolExecutor</code>, который может содержать изменяющееся число нитей. 
Число нитей в пуле задается с помощью <code>corePoolSize</code> и <code>maximumPoolSize</code>.