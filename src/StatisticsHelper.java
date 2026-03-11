public class StatisticsHelper {
    public String name;
    public StatisticsHelper(String name) {
        this.name = name;
    }

    public void calculateMax(int[] values) {

    }

    public void calculateMin(int[] values) {
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            min = Math.min(min, values[i]);
            if (min == 6) break;
        }
    }
}
