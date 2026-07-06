void main(){
    IO.print("Enter your weight : ");
    float weight = Float.parseFloat(IO.readline());
    IO.print("Enter your height : ");
    float height = Float.parseFloat(IO.readLine());
    float bmi = weight / (heigth * height);
    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
}