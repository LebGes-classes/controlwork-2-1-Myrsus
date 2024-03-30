public class Main {
    public static void main(String[] args){

        MyLinkedList<Integer> lst = new MyLinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        for (int i = 0; i < 3; i++){
            System.out.println(lst.get(i));
        }
    }
}
