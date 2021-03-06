Потоками-демонами называются потоки, работающие в фоновом режиме для нашей программы.

В Java процесс завершается тогда, когда завершается последний его поток. Даже если метод <code>main()</code> уже завершился, но еще выполняются порожденные им потоки, система будет ждать их завершения.

Однако это правило не относится к особому виду потоков – **демонам**. 
Если завершился последний обычный поток процесса, и остались только потоки-демоны, то они будут принудительно завершены и выполнение процесса закончится. 
Чаще всего потоки-демоны используются для выполнения фоновых задач, обслуживающих процесс в течение его жизни.