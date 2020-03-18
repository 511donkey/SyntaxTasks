public class TwoDShape {

    double width;
    double height;

    void Showdim () {
        System.out.println("Ширина и высота " + width + " и " + height);
    }
}

 class Triangles extends TwoDShape {
    double width2;
    double width3;

    void Showdim() {
        System.out.println("Длины сторон треугольника - " +
                width + " " + width2 + " " + width3);
        System.out.println("Высота треугольника - " + height);
    }

    double area() {
        return width * height / 2;
    }

    double perimeter () {
        return width + width2 + width3;
    }
}

class Rectangle extends TwoDShape {
    double area() {
        return width * height;
    }

    double perimetre() {
        return width * 2 + height * 2;
    }
}

class Circle extends TwoDShape {
    double p = 3.14;

    void ShowDim() {
        System.out.println("Диаметр круга - " + height);
    }

    double lenght() {
        return height * p;
    }
}




