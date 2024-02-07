package org.roszak.customkolekcje;

public class CustomLinkedList {
    private Node head;
    private static class Node {
        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    public CustomLinkedList() {
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" + head +
                '}';
    }

    //ZADANIE 1:

//    Nie mozesz uzywac tablic, list, setow, zadnych kolekcji czy kolejek, ani konkatenowac to w Stringi czy appendowac
//    w string buildery/buffery/joinery

    //napisz metodę, która:
    //pozwoli na dodanie obiektu do listy

    public void add(String data){
        if (this.head!=null){
            Node n = this.head;
            while (n.next!=null){
                n=n.next;
            }
            Node node = new Node(data, null);
            n.next=node;

            int i = 0;
            while(i != 5){
                i++;
            }

        } else {
            Node node = new Node(data, null);
            this.head = node;
        }
    }

    //pozwoli na wziecie obiektu z danego indexu

    public Node get(int index){
        Node n = this.head;
        int round = 0;

        if (index == round){
            return n;
        }
        while(index>=round){
            n=n.next;
            round++;

        }
        return null;
    }

    //pozwoli na wziecie obiektu o danej wartosci

    //pozwoli na usuniecie obiektu z danego indexu
    //pozwoli na usuniecie obiektu o danej wartosci
    //pozwoli na wyświeltnie wszystkiego

    //stwórz klaske LinkedLists, która będzie dostarczac metody:
    //zwraca największą liste pod względem wielkości
    //sortuje elementy danej listy, w kolejności - nie mozesz uzywać żadnych zewnętrznych metod do sortowania

    //ZADANIE 2:

    //napisz wlasna implementacje inteferjsu list i array listy dla String
    //CustomLinkedLsit powinnien implementować nasz interfejs CustomList
}
