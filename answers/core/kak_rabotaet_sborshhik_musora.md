Во-первых что стоит сказать, что у сборщика мусора есть несколько алгоритмов работы, он не один.

Когда происходит очистка памяти? Если память в Первой куче полностью заполнена, то туда идет сборщик мусора и делает свою работу) Какую именно, зависит от обстоятельств. Например если в первой куче много мусора(т.е. объектов с нулевой ссылкой), то сборщик мусора помечает эти объекты, далее те что остались объекты со ссылками он их переносит в Выжившую кучу, а в первой куче он просто все удаляет.

Ситуация другая, в первой куче мало мусора, но очень много рабочих объектов. Как поступает в этом случае сборщик мусора?

Он помечает мусор, удаляет его и оставшиеся объекты компонует.

Также следует заметить что при нехватке места в Выжившей куче, объекты переносятся в старую кучу, там хранятся как правило долго живущие объекты.

Также следует заметить что сборщик мусора вызывается сам периодически, а не только когда памяти не хватает.