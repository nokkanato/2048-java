public class Table {
    private Object[][] table;
    private int height, width;


    public Table(int width, int height){
        this.width = width;
        this.height = height;
        table = new Object[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }



}
