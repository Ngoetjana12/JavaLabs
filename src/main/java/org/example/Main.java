package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    }
}
