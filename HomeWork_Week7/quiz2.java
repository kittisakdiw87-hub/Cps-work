void main() {
    int num1 = Integer.parseInt(IO.readln("Enter a number 1 : "));
    int num2 = Integer.parseInt(IO.readln("Enter a number 2 : "));
    if (num1 > num2) {
        int Total = num1 - num2;
        IO.println(num1 + " - " + num2 + " = " + Total);
    } else {
        int Total = num1 + num2;
        IO.println(num1 + " + " + num2 + " = " + Total);
    }
}
