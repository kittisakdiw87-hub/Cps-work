void main() {
    int mid = Integer.parseInt(IO.readln("Enter your midterm score : "));
    int finalscore = Integer.parseInt(IO.readln("Enter your final score : "));
    int number = mid + finalscore;
    if (number >= 50) {
        IO.println("Your total score is " + number + " . The result is Pass!!");
    } else {
        IO.println("Your total score is " + number + " . The result is Fail!!");
    }
}
