public class Wall {
    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Wall(double width, double height) {
        if ( width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
        if (height < 0){
            this.height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
