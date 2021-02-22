
### Задача 1 🃏

Напишите программу, которая должна имитировать раздачу карт для игры в покер.
Программа получает число n, задаваемое с консоли пользователем, и раздает карты
на n  игроков (по 5 карт каждому) из рассортированной колоды.
Разделяйте пять карт, выданных каждому игроку, пустой строкой.
Объект карты реализуется классом [PlayingCard][1].

#### Комментарии
* Для инициализации колоды карт задействуются статические поля **SUITS_LIST** и **RANK_LIST** 
класса [PlayingCard].
* Перед раздачей колоду необходимо перемешать. Задействуйте класс [Random].
* Программа должна валидировать вводимое количество игроков и при необходимости
выводить сообщение об ошибке.