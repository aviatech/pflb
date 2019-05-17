package kangaroo;

public class Main {
    public static void main(String[] args) {
        KangarooShow kangaroo1 = new KangarooShow(1,2);
        KangarooShow kangaroo2 = new KangarooShow(2,1);
        boolean result = kangaroo1.isKangarooCrossing(kangaroo2);
        System.out.println(result);
    }
}
