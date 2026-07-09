void main() {
    IO.print("Enter distance :  ");
    double distance = Double.parseDouble(IO.readln());
    IO.print("Enter Fuel Efficiency : ");
    double FuelEff = Double.parseDouble(IO.readln());
    double FuelUsed = distance / FuelEff;
    IO.println("Fuel Used = %.2f liter ".formatted(FuelUsed));
    IO.print("Enter Fuel Price Per Liter : ");
    double FuelPPL = Double.parseDouble(IO.readln());
    double ToatalCost = FuelUsed * FuelPPL;
    IO.println("Total Cost = %.2f Baht ".formatted(ToatalCost));
}