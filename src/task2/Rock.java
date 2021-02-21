package task2;

public class Rock {

    private int max_height;
    private int difference3_step;
    private int length;

    public int getMax_height() {
        return max_height;
    }

    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }

    public int getDifference3_step() {
        return difference3_step;
    }

    public void setDifference3_step(int difference3_step) {
        this.difference3_step = difference3_step;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 3) {
            this.length = length;
        } else {
            System.out.println("Путь не может быть меньше трех вершин");
        }
    }

    public void printRoute () {
        int[] route = new int[length];
        int[] temp = new int[3];

        int max;
        int min;
        int difference = 0;

        route[0] = difference3_step / 2 + (int) (Math.random()*difference3_step / 2);
        route[1] = (int) (Math.random()*difference3_step);

        if (route[0] > route[1]) {
            max = route[0];
            min = route[1];
        }
        else {
            max = route[1];
            min = route[0];
        }
        System.out.println(route[0]);
        System.out.println(route[1]);

        difference = Math.abs(max-min);

        for (int i = 2; i < length; i++) {
            int a = negative(min, difference - difference);
            int b = positive(max, difference3_step - difference);

            route[i] = (int) (Math.random() * (b - a ) + a);

            if (route[i] > max) {
                max = route[i];
            };

            if (route[i] < min) {
                min = route[i];
            };

            difference = Math.abs(max-min);

            System.out.println(route[i]);

        }


    }



    private int positive (int max_f, int diff) {
        if (max_f+diff > max_height) {
             return max_height;
        }
        else
            return max_f+diff;
    }

    private int negative (int min_f, int diff) {
        if (min_f-diff < 0) {
            return 0;
        }
        else
            return min_f-diff;
    }


    public Rock()
    {

    }

}
