package lr2;

public class Example20_Rectangle {
    private int length;
    private int width;

    public Example20_Rectangle( int length, int width){
        this.length = length;
        this.width = width;

    }

    public int getLength () {
        return length;
    }

    public void setLength ( int length){
        this.length = length;
    }

    public int getWidth () {
        return width;
    }

    public void setWidth ( int width){
        this.width = width;
    }
    public int perimeter () {
        return 2 * (this.length + this.width);
    }
    public int area () {
        return this.length * this.width;
    }
}

