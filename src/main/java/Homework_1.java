public class Homework_1 {
    public static void main (String [] args) {
     String name = "Пупкин Пуп Пупкович"; // фио сотрудника
     String position = "Шаурмейкер"; // должность
     int rate = 100; // ставка за смену
     int smena = 20; // количество смен
     int bonus = 500; // премия фиксированная
     int fine = 50; // штраф за 1 сгоревший лаваш
     int count = 100; // кол-во проданной шаурмы

     int baseSalary = smena * rate; // базовая зп
     int finalFine = fine * 6; // итоговый штраф
     int finalSalary = baseSalary - finalFine + bonus; // итоговая зп со штрафом и премией
     int revenue = count * 25; // выручка



        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: "+ position);
        System.out.println("Зарплата без премии: "+ baseSalary);
        System.out.println ("Итоговый штраф: " + finalFine);
        System.out.println ("Премия: " + bonus);
        System.out.println ("итоговая зарплата: " + finalSalary);
        System.out.println ("Выручка за месяц: " + revenue);


    }
}

/*
В этом же методе напиши код, который выведет:

- штраф, премию и итоговую зарплату с учетом премии и штрафом

- выручку (количество проданной шарумы умножить на стоимость шаурмы)

Пример консольного вывода:
Сотрудник: Глеб
Должность: Старший шаурма-инженер
Оплата за смены: 16000
Премия: 3000
Штраф: 500
Итоговая зарплата: 18500
Шаур-выручка: 900000
 */