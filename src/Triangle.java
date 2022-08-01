public class Triangle extends Shape {
    private double size1;
    private double size2;
    private double size3;
    public Triangle(String green){
        size1 = 0;
        size2 = 0;
        size3 = 0;
    }
    public Triangle(double size1,double size2,double size3){
        if (size1 + size2 <= size3 || size1 + size3 <= size2 || size2 + size3 <= size1){
            size1 = 0;
            size2 = 0;
            size3 = 0;
        } else {
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;
        }
    }

    public Triangle(String green, boolean b) {
    }

    public Triangle(String green, boolean b, double v, double v1, double v2) {

    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getPerimter(){
        return size1+size2+size3;
    }
    public double getArea(){
        double a = getPerimter()/2;
        return Math.sqrt(a*(a-getSize1()) * (a*(a-getSize2()) * (a*(a-getSize3()))));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                '}';
    }
}
