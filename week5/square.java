void main() {
    double base = Double.parseDouble(IO.readln("Enter the base of the triangle : "));
    double height = Double.parseDouble(IO.readln("Enter the height of the triangle : "));
    double triangle = (1.0 / 2.0) * base * height;
    IO.println(("Area of the triangle : %.2f square units").formatted(triangle));
    IO.println("------------------------------------------------");
    double lenght = Double.parseDouble(IO.readln("Enter the lenght of the rectangle : "));
    double width = Double.parseDouble(IO.readln("Enter the width of the rectangle : "));
    double rectangle = lenght * width;
    IO.println(("Area of the rectangle : %.2f square units").formatted(rectangle));
}