void main() {
    IO.print("Enter Number : ");
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("The Evan " + number + " Number");
    } else {
        IO.println("The Odd " + number + " Number");
    }
}