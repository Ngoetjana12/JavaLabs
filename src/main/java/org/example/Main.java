package org.example;

public class Main {
    static void main() {

        // 1.1 Student Details
        StudentDetails student = new StudentDetails("Naledi", 20, 76.5, true);
        student.displaySummary(true);

        //1.2 Shopping Total
        ShoppingCart cart = new ShoppingCart("PlayStation5", 16500.00, 2);
        double total = cart.calculateAmt(cart.price, cart.quantity);
        cart.displaySummary(total, cart.quantity);

        //1.3 Temperature converter
        TemperatureConverter tc = new TemperatureConverter(27);
        tc.displaySummary();

        //2.1 Pass or Fail
        PassOrFail pp = new PassOrFail(56);
        String result = pp.getResult();
        pp.displaySummary();

        //2.2 Grade Calculator
        GradeCalculator student1 = new GradeCalculator(85.0);
        student1.displaySummary();

        //2.3 Number Analysis
        NumberAnalysis num1 = new NumberAnalysis(15);
        num1.displaySummary();

        //2.4 Login Check
        String checkedUsername = "admin";
        String checkedPassword = "123Password";

        LoginCheck lc = new LoginCheck("admin", "123Password");

        if(lc.isValidated(checkedUsername, checkedPassword)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Credentials");
        }

        //3.1 Student Marks
        int[] marks = {50, 50, 50, 50, 50};
        StudentsArray students = new StudentsArray(marks);

        double totalMarks = students.getTotal(marks);
        double averageMark = students.getAvg(marks, totalMarks);
        students.displaySummary(totalMarks, averageMark);

        //3.2 Highest and Lowest Values
        int[] values = {50, 50, 50, 50, 40, 60};

        HighestAndLowest hl = new HighestAndLowest(values);

        int highest = hl.getLargestValue();
        int lowest = hl.getSmallestValue();
        int length = values.length;
        int count = hl.countAbove50(values);
        hl.displaySummary(highest, lowest, length, count);

        //3.3 Search an array
        int[] dice = {1,2,3,4,5,6};
        int target = 6;

        SearchArray searchDice = new SearchArray(dice);

        int index = searchDice.search(target);
        searchDice.displaySummary(index);

        //3.4 Even or Odd
        int[] EvenAndOdd = {2, 4, 6, 7, 9};
        EvenOdd eo = new EvenOdd(EvenAndOdd);
        eo.count(dice);

        //3.5 Array Reversal

         int[] listofNumbers = {1, 2, 3, 4, 5, 6};

        ReversedArray rArray = new ReversedArray();
        rArray.reverseArr();

    }
}
