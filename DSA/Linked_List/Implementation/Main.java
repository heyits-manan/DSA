package Implementation;

public class Main {
    public static void main(String[] args) {
        var list = new LL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(30));
        System.out.println(list.contains(50));
    }
}
