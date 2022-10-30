public class RanbomByWeight {
    private int[] newValues;

    public RanbomByWeight(int[] elements, int[] weight) {
        var weightsSum = 0;
        for (int i : weight) {
            weightsSum += i;
        }
        var newValuesCounter = 0;
        newValues = new int[weightsSum];
        for (var el = 0; el < weight.length; el++) {
            for (var weightCounter = 0; weightCounter < weight[el]; weightCounter++) {
                newValues[newValuesCounter] = elements[el];
                newValuesCounter++;
            }
        }
    }

    public int getRandomByWeight() {
        var randomNumber = (int) (Math.random() * newValues.length);
        return newValues[randomNumber];
    }
}
