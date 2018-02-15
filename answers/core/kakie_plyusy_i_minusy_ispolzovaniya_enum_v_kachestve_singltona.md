Enum предоставляет быстрый ярлык для воплощения паттерна синглтона, и поскольку об этом сказано даже в книге «Эффективная Java», такой выбор весьма популярен.
На первый взгляд, синглтон Enum многообещающ и весьма удобен, например контролирует создание экземпляра, безопасно сериализуется и прежде всего, легко создать потокобезопасный синглтон с использованием Enum.
Вам не нужно больше заботиться о двойной проверке волатильности переменных.