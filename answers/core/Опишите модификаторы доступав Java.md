В Java существуют следующие модификаторы доступа: 

- private: (используется в конструкторах, внутренних классах, методах и полях класса) - Доступ разрешен только в текущем классе.

- default (package-private): (используется в классах, конструкторах, интерфейсах, внутренних классах, методах и полях класса) - Доступ на уровне пакета. Если класс будет так объявлен он будет доступен только внутри пакета.

- protected: (используется в конструкторах, внутренних классах, методах и полях класса) Модификатор доступа на уровне пакета и в иерархии наследования.

- public: (используется в классах, конструкторах, интерфейсах, внутренних классах, методах и полях класса) - Модификатор доступа общественный, доступен всем.

Последовательность модификаторов по убыванию уровня закрытости: private, default ,protected, public).