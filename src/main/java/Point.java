public class Point {

    private int x;
    private int y;
    private boolean isSelectable;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, boolean isSelectable) {
        this.x = x;
        this.y = y;
        this.isSelectable = isSelectable;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setIsSelectable(boolean isSelectable) {
        this.isSelectable = isSelectable;
    }

    public boolean getIsSelectable() {
        return this.isSelectable;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
