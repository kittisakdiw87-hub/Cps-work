void main(){
    IO.print("Enter Wide : ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter your Long : ");
    double long1 = Double.parseDouble(IO.readln());
    double bsa = (wide * long1) / 360 ;
    IO.println("Wide = %.2f kg, Long = %.2f m, BSA = %.2f".formatted(wide,long1, bsa));
}