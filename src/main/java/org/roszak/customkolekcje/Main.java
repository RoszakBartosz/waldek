package org.roszak.customkolekcje;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("XD");
        customLinkedList.add("XD2");
        customLinkedList.add("XD3");

//        customLinkedList.add("XD2");
//        customLinkedList.remove("XD");
//        customLinkedList.get("XD2");
        System.out.println(customLinkedList.get(2));

//        customLinkedList.remove(1);
        System.out.println(customLinkedList);
    }
}
