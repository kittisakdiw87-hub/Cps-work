void main() {
    IO.print("Enter salary : ");
    int salary = Integer.parseInt(IO.readln());
    IO.print("Enter deduction percent : ");
    int deductionPer = Integer.parseInt(IO.readln());
    double Deduction = salary * deductionPer / 100;
    double Net = salary - Deduction;
    IO.println("Deduction = %.2f Baht ".formatted(Deduction));
    IO.println("Net salary = %.2f Baht ".formatted(Net));
}
