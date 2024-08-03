RU text
Задача 1
Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
Эту проверку вы уже реализовывали в задании по условным операторам.
Текст прошлого задания
Напишите программу, которая определяет, является ли год високосным или нет.
Назовите year переменную года, в которую можно подставить значение интересующего нас года. Например, 2021.
Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: « …. год является високосным» или «... год не является високосным».
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.

Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».

Задача 2
Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
Текст прошлого задания
У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона, ему предлагается скачать приложение с учетом операционной системы и года выпуска телефона.
Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
Для года создания телефона используйте переменную 
clientDeviceYear, в которой необходимо указать 2015 год.
Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).

Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить облегченную версию.
Текущий год можно получить таким способом:
int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную — ввести в переменную числовое значение.
В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.

Задача 3
Возвращаемся к задаче на расчет дней доставки банковской карты.
Текст прошлого задания
В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... » + срок доставки.
Объявите целочисленную переменную 
deliveryDistance = 95, которая содержит дистанцию до клиента.

Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
