import java.util.List;
import java.util.LinkedList;

public class SubrectangleQueries {

    private class Update {
        int row1;
        int col1;
        int row2;
        int col2;
        int value;

        public Update(int row1, int col1, int row2, int col2, int value) {
            this.row1 = row1;
            this.col1 = col1;
            this.row2 = row2;
            this.col2 = col2;
            this.value = value;
        }
    }

    private int[][] r;
    private List<Update> updates;

    public SubrectangleQueries(int[][] rectangle) {
        r = rectangle;
        updates = new LinkedList<>();
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int value) {
        Update update = new Update(row1, col1, row2, col2, value);
        updates.add(update);
    }

    public int getValue(int row, int col) {
        int val = r[row][col];
        for (Update update : updates) {
            if (row >= update.row1 && row <= update.row2 && col >= update.col1 && col <= update.col2) {
                val = update.value;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[][] rectangle = {{1, 2, 4, -1}, {6, 7, 8, 9}, {10, 12, 11, 6}, {1, -1, 3, 11}};
        SubrectangleQueries s = new SubrectangleQueries(rectangle);
        s.updateSubrectangle(1, 1, 2, 2, 0);
        int value = s.getValue(1, 1);
        System.out.println(value);
    }
}
