void main() {
    IO.println("ใส่เลขเลข 5 ตัว เพื่อนำไปคิดและทำเป็นค่าเฉลี่ย");
    IO.print("Do you want number : ");
    double num1 = Integer.parseInt(IO.readln());
    IO.print("Do you want number : ");
    double num2 = Integer.parseInt(IO.readln());
    IO.print("Do you want number : ");
    double num3 = Integer.parseInt(IO.readln());
    IO.print("Do you want number : ");
    double num4 = Integer.parseInt(IO.readln());
    IO.print("Do you want number : ");
    double num5 = Integer.parseInt(IO.readln());
    double sum = num1 + num2 + num3 + num4 + num5 ;
    double avg = sum / 5 ;
    IO.println("Awnser is. : " + sum + " = " + avg );
}