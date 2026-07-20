void main() {
    int choose = Integer.parseInt(IO.readln("man be 1 / woman be 2 : "));
    int weight = Integer.parseInt(IO.readln("Enter your weight(kg) : "));
    int height = Integer.parseInt(IO.readln("Enter your height(cm) : "));
    int age = Integer.parseInt(IO.readln("Enter your age : "));
    if (choose == 1) {
        double BMR = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        IO.println("Your(m) BMR is :" + BMR);
    } else {
        double BMR = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        IO.println("Your(w) BMR is :" + BMR);
    }
}
