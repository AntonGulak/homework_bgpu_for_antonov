package task2;

public class Rock {

    //private int[] route;
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
        this.length = length;
        //int[] route = new int[length];
    }

    public void printRoute () {
        for (int i = 0; i < length; i++)
        {
            int temp_random = (int) (Math.random() * max_height);


        }

    }

    public Rock()
    {

    }

}
