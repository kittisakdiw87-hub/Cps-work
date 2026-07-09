void main() {
    IO.print("Enter score1 : ");
    int score1 = Integer.parseInt(IO.readln());
    IO.print("Enter score2 : ");
    int score2 = Integer.parseInt(IO.readln());
    IO.print("Enter score3 : ");
    int score3 = Integer.parseInt(IO.readln());
    int Sum = score1 + score2 + score3;
    IO.println("Total score = " + Sum);
    IO.print("Enter bonus : ");
    int bonus = Integer.parseInt(IO.readln());
    int Total = Sum + bonus;
    IO.println("Total with bonus = " + Total);
    double Avg = Total / 3.0;
    IO.println(("Average of totalWithBonus") + "(" + Total + ") = " + ("%.2f point ").formatted(Avg));
}