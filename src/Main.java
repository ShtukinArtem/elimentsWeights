public class Main {
    public static void main(String[] args) {
        var elements = new int[]{1, 3, 10, 6, 4};
        var weight = new int[]{4, 2, 1, 5, 2};
        RanbomByWeight myRandom = new RanbomByWeight(elements, weight);
        System.out.println(myRandom.getRandomByWeight());
    }
}