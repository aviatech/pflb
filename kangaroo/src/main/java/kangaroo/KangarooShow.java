package kangaroo;

class KangarooShow {
    private int start;
    private int length;

    KangarooShow(int start, int length) {
        this.start = start;
        this.length = length;
    }

    boolean isKangarooCrossing(KangarooShow kangaroo) {
        return (start + length) == (kangaroo.start + kangaroo.length);
    }
}
