## Commands
- <code>gradle tasks</code> - посмотреть список доступных задач

## Options
- <code>--scan</code> - включение сканирования билда 
- <code>gradle build --console=plain</code> - вывод исполняемых тасков


### notes
1. show gradle home dir
   - create ````gradle.build```` file
   ````
   task getHomeDir {
       doLast {
           println gradle.gradleHomeDir
       }
   }
   ````
   - run 
   ````
   gradle getHomeDir
   ````
   