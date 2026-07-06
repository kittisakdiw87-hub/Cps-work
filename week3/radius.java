void main() {
    IO.print("Do you want first number : ");
    double radiusX = Integer.parseInt(IO.readln());
    IO.print("Do you want second number : ");
    double radiusY = Integer.parseInt(IO.readln());
    double range = 3.14 * radiusX * radiusY;
    IO.println("Range is : " + range);
}