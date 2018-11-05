1. show gradle home dir
   - create ````gradle.build```` file
   ````
   task getHomeDir {
       doLast {
           println gradle.gradleHomeDir
       }
   }
   ````
   - run ````gradle getHomeDir```
   
2. список доступных задач
   ````
   gradle tasks
   ````