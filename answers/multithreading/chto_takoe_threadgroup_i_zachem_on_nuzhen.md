ThreadGroup представляет собой набор нитей, которые так же могут содержать в себе другие группы потоков.
Группа нитей образует дерево, в котором каждая другая группа нитей имеет родителя (кроме исходной). Поток имеет право доступа к данным из своей группы нитей, но не имеет такого доступа к другим группам или к родительской группе потоков.