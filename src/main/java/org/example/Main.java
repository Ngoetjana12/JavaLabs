package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
       public static void main(String[] args) {
/*
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

        //4.1 Student Class
        Student stud = new Student("Thami", "25626222", 82);
        Student stud2 = new Student("Motsei", "34567893", 85);

        boolean isPassed = stud.hasPassed(82);
        stud2.display();

        //4.2 BankAccount Class
        BankAccount acc = new BankAccount("Thimza", "160965323", 100);
        acc.deposit(50);
        acc.getBalance();
        acc.withdraw(30);
        acc.getBalance();



        //4.3 Product Inventory
        Product p = new Product("123", "Playstation5", 16000, 3);

        p.addStock();
        p.reduceStock();
        p.calculateValue();
        p.displayDetails();

        //4.4 Rectangle
        Rectangle rc = new Rectangle(10, 5);
        rc.areaCalc();
        rc.perimeterCalc();

        Rectangle rc2 = new Rectangle(20, 10);
        rc2.areaCalc();
        rc2.perimeterCalc();

        //5.1 Student Result System
        int[] makwaMarks = {67, 76, 56};
        int[] thamiMarks = {46, 49, 70};
        int[] moMarks = {85, 43, 60};

        StudentSystem studd = new StudentSystem("111", "Makwa", makwaMarks);
        StudentSystem studd2 = new StudentSystem("222", "Thami", thamiMarks);
        StudentSystem studd3 = new StudentSystem("333", "Mo", moMarks);

        double avg = studd.calcAvg();
        studd.determineResult(avg);

        double avg2 = studd2.calcAvg();
        studd2.determineResult(avg2);

        double avg3 = studd3.calcAvg();
        studd3.determineResult(avg3);

        //5.1 Determine the student with the highest average
        double[] avgs = {avg, avg2, avg3};

        StudentSystem ss = new StudentSystem();
        ss.highestAvg(avgs);
        ss.countPassed(avgs);

        //5.2 Mini point-of-sale

           ProductClass pd = new ProductClass("Shirt", 50, 3);
           ProductClass pd2 = new ProductClass("iPhone17 Pro", 120, 1);
           ProductClass pd3 = new ProductClass("GTA6", 100,4);
           ProductClass pd4 = new ProductClass("Nike Tn", 150, 5);

           ArrayList<ProductClass> pros = new ArrayList<>();
           pros.add(pd);
           pros.add(pd2);
           pros.add(pd3);
           pros.add(pd4);

           pd.calcLine(pros);


           Employee emp = new Employee("1111", "Thami", 9000);
           Employee emp2 = new Employee("2222", "Thabi", 15000);
           Employee emp3 = new Employee("3333", "Mo", 20000);
           Employee emp4 = new Employee("4444", "Makwa", 25000);
           Employee emp5 = new Employee("5555", "Skari", 30000);

           ArrayList<Employee> employees = new ArrayList<>();

           employees.add(emp);
           employees.add(emp2);
           employees.add(emp3);
           employees.add(emp4);
           employees.add(emp5);

           emp.display(employees);
*/
           //6.1 Incorrect String Comparison
           String first = new String("Java");
           String second = new String("Java");

           if (first.equals(second)) {
               System.out.println("Same text");
           } else {
               System.out.println("Different text");
           }

           //6.2 ArrayIndex
           int[] numbers = {10, 20, 30};

           for (int i = 0; i < numbers.length; i++) {
               System.out.println(numbers[i]);
           }

           //6.3
           int mark = 85;

           if (mark >= 50 && mark < 80) {
               System.out.println("Pass");
           } else if (mark >= 80) {
               System.out.println("Distinction");
           }

       }
}
