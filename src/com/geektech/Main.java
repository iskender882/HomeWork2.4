package com.geektech;


import java.util.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        Scanner user = new Scanner(System.in);
        listA.add(user.next());
        listA.add(user.next());
        listA.add(user.next());
        listA.add(user.next());
        listA.add(user.next());
        Iterator<String> user1 = listA.iterator();
        while (user1.hasNext()) {
            System.out.println(user1.next());
        }
        ArrayList<String> listB = new ArrayList<>();
        listB.add(user.next());
        listB.add(user.next());
        listB.add(user.next());
        listB.add(user.next());
        listB.add(user.next());
        Iterator<String> user2 = listB.iterator();
        while (user2.hasNext()) {
            System.out.println(user2.next());
        }
        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);
        Iterator<String> user3 = listA.iterator();
        while (user3.hasNext())


            Collections.sort(listC);
        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);


    }
}

/*
)  В задании нельзя использовать циклы for и for each. Только while и Iterator
b)  Написать приложение которое бы считывало сначала 5 строк
 которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
 После также отображает его в консоли
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с
 наименьшим количеством символов, и распечатать отсортированный список С
 */
