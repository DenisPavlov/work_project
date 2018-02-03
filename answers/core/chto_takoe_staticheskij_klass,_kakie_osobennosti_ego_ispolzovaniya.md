Статическим классом может быть только внутренний клас(определение класса размещается внутри другого класса). В объекте обычного внутреннего класса хранится ссылка на объект внешнего класса. Внутри статического внутреннего класса такой ссылки нет.

То есть: Для создания объекта статического внутреннего класса не нужен объект внешнего класса. Из объекта статического вложенного класса нельзя обращаться к нестатическим членам внешнего класса напрямую. И еще обычные внутренние классы не могут содержать статические методы и члены.

Зачем вообще нужны внутренние классы? - Каждый внутренний класс способен независимо наследовать определенную реализацию. Таким образом внутренний класс не ограничен при наследовании в ситуациях, когда внешний класс уже наследует реализацию. То есть это как бы вариант решения проблемы множественного наследования.