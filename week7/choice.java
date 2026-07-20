void main() {
    IO.println("choice 1 or 2");
    IO.print("Enter choice number : ");
    int number = Integer.parseInt(IO.readln());
    if (number == 1) {
        double base = Double.parseDouble(IO.readln("Enter the base of the triangle : "));
        double height = Double.parseDouble(IO.readln("Enter the height of the triangle : "));
        double triangle = (1.0 / 2.0) * base * height;
        IO.println(("Area of the triangle : %.2f square units").formatted(triangle));
    } else if (number == 2) {
        IO.print("Enter your weight : ");
        double weight = Double.parseDouble(IO.readln());
        IO.print("Enter your height : ");
        double height = Double.parseDouble(IO.readln());
        double bmi = weight / (height * height);
        IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
    } else {
        IO.println("Error");
    }

}
