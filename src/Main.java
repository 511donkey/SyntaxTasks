public class Main {
    public static void main(String[] args) {
        Triangles t1 = new Triangles();
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        t1.height = 2;
        t1.width = 3;
        t1.width2 = 4;
        t1.width3 = 5;

        r1.height = 3;
        r1.width = 4;

        c1.height = 5;

        System.out.println("Информация о треугольнике ");
        t1.Showdim();
        System.out.println("Площадь - " + t1.area());
        System.out.println("Периметр - " + t1.perimeter());

        System.out.println("Информация о прямоугольнике ");
        r1.Showdim();
        System.out.println("Площадь - " + r1.area());
        System.out.println("Периметр - " + r1.perimetre());

        System.out.println("Информация о круге ");
        c1.ShowDim();
        System.out.println("Длина круга - " + c1.lenght());


    }
}
