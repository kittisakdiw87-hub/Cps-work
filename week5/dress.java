void main() {
    int price = Integer.parseInt(IO.readln("Enter price of one dress : "));
    int number = Integer.parseInt(IO.readln("Enter number of dresses to buy : "));
    int discount = Integer.parseInt(IO.readln("Enter discount rate : "));
    IO.println("--------------------------------------");
    double Total = price * number;
    double Amount = discount * number;
    double Net = Total - Amount;
    IO.println("Total cost = %.1f Baht ".formatted(Total));
    IO.println("discountAmount = %.1f Baht ".formatted(Amount));
    IO.println("Net Pay = %.1f Baht ".formatted(Net));
}