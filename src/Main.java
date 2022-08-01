public class Main {
    public static void main(String[] args) {
        System.out.println("-------Shape-------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("pink",false);
        System.out.println(shape);
        System.out.println("-------Triangle-------");
        Triangle triangle = new Triangle("Green");
        System.out.println(triangle);
        triangle = new Triangle("Green",true,4.0,5.0,6.5);
        System.out.println(triangle);
    }
}
