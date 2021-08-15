package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("rose");
        myList.add("sunflower");
        myList.add("crocus");
        myList.add("tulip");
        myList.add("lily");
        System.out.println("Список входной "+ myList);
        System.out.println("Список перевернутый "+ reverseList(myList));
    }

    public static List<String> reverseList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            List<String> invertedList = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                invertedList.add(list.get(i));
            }
            return invertedList;
        }
    }
}
