void main() {
    IO.print("Enter Initial Saving : ");
    int InitialSaving = Integer.parseInt(IO.readln());
    IO.print("Enter Monthly Saving : ");
    int MonthlySaving = Integer.parseInt(IO.readln());
    IO.print("Enter Months : ");
    int Months = Integer.parseInt(IO.readln());
    IO.print("Enter Interest Percent : ");
    int InterestPer = Integer.parseInt(IO.readln());
    double TotalSaving = InitialSaving + MonthlySaving * Months;
    IO.println("Total Saving before Interest = %.2f Baht ".formatted(TotalSaving));
    double Interest = TotalSaving * InterestPer / 100;
    IO.println("Interest = %.2f Baht ".formatted(Interest));
    double FinalSaving = TotalSaving + Interest;
    IO.println("Final Saving = %.2f Baht ".formatted(FinalSaving));
}