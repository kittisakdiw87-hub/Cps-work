void main() {
    IO.print("Enter hours : ");
    int hours = Integer.parseInt(IO.readln());
    IO.print("Enter minutes : ");
    int minutes = Integer.parseInt(IO.readln());
    int TotalMin = (hours * 60) + minutes;
    IO.println("Anwser : " + hours + " * 60" + " + " + minutes + " = " + TotalMin);
}