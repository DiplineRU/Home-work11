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


ENG text
Task 1
Implement a method that gets the year as a parameter, checks if it is a leap year, and outputs the result to the console.
You have already implemented this check in the conditional statement task.
The text of the last assignment
Write a program that determines whether a year is a leap year or not.
Name the year variable of the year, in which you can substitute the value of the year we are interested in. For example, 2021.
The program should determine whether the year is a leap year or not, and display the appropriate message: ".... the year is a leap year" or "... the year is not a leap year".
A little help: every fourth year is a leap year, but not every hundredth. Every four hundredth year is also a leap year.

Now wrap the check in a method and use the year that comes as a parameter.
Output the result of the program to the console. If the year is a leap year, then print the message: "... the year is a leap year." If the year is non—leap, then: "... the year is a non-leap year."

Task 2
Remember task 2 from the lesson "Conditional operators", where you offered the user a lightweight version of the application.
The text of the previous assignment
The bank has a mobile application. When a user visits the site from a phone, they are prompted to download the application, taking into account the operating system and the year of release of the phone.
Your task is to write a program that issues a corresponding message to the client under two conditions.
If the release year is earlier than 2015, then you need to add information about the lite version to the installation message:
For iOS, it will sound like this: "Install the lite version of the iOS app via the link."
For Android: "Install the lite version of the Android app via the link."
For users of phones released in 2015 and later, you need to display the usual offer to install the application.
For the year the phone was created, use the clientDeviceYear variable
, in which you need to specify the year 2015.
Important: nesting of more than two floors is not allowed (conditional operator inside conditional operator).

Write a method where two parameters are supplied: the type of operating system (0 — iOS, 1 — Android) and the year of release of the device.
If the device is older than the current year, ask it to install the lite version.
The current year can be obtained in this way:
int currentYear = LocalDate.now().getYear();
Or set the value manually yourself — enter a numeric value into the variable.
As a result, the program should output a message to the console indicating which version of the application (regular or lite) and for which OS (Android or iOS) the user should install.

Task 3
We return to the task of calculating the days of delivery of the bank card.
The text of the previous assignment
The bank organizes home delivery of cards for customers. To notify the customer when his card will be delivered, you need to know the distance from the office to the delivery address.
The delivery rules are as follows:
Delivery within 20 km takes a day.
Shipping within 20 km to 60 km adds another day of delivery.
Delivery within 60 km to 100 km adds another day.
There is no delivery over 100 km.
That is, with each subsequent delivery interval, the time period increases by 1 day.
Write a program that outputs a message to the console: "It will take days: ... " + delivery time.
Declare the integer variable
deliveryDistance = 95, which contains the distance to the customer.

Your task is to refine the code, namely to write a method that accepts the distance as input and returns the total number of days of delivery.
