package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*****Задание 1****");
        String firstName ="Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName+ " " + middleName+" "+lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("*****Задание 2****");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("*****Задание 3****");
        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — "+fullName2.replace("ё","е"));
    }
}
