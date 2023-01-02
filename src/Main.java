public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int dollars = 3465000;
        System.out.println("The value of a variable dollars with type int is " + dollars);
        byte temperatureMoon = -128;
        System.out.println("The value of a temperatureMoon with type byte is " + temperatureMoon);
        short marianaTrench = 10994;
        System.out.println("The value of a marianaTrench with type short is " + marianaTrench);
        long sunDistance = 149597870700L;
        System.out.println("The value of a sunDistance with type long is " + sunDistance);
        float pixelSize = 0.297f;
        System.out.println("The value of a pixelSize with type float is " + pixelSize);
        double waterMolecule = 0.00000000003;
        System.out.println("The value of a waterMolecule with type double is " + waterMolecule);


        //task 2
        System.out.println("task 2");
        float number1 = 27.12f;
        System.out.println(number1);
        long number2 = 987678965549L;
        System.out.println(number2);
        float number3 = 2.786f;
        System.out.println(number3);
        short number4 = 569;
        System.out.println(number4);
        int number5 = 159;
        System.out.println(number5);
        int number6 = 27897;
        System.out.println(number6);
        byte number7 = 67;
        System.out.println(number7);


        //task 3
        System.out.println("task 3");
        byte luba = 23;
        byte ann = 27;
        byte katy = 30;
        short paper = 480;
        int calculated = paper / (luba + ann + katy);
        System.out.println("For each student is calculated " + calculated + " sheets of paper");


        //task 4
        System.out.println("task 4");
        byte minutes = 20;
        int machinePerformance = (minutes / 2) * 16;
        System.out.println("For " + minutes + " minutes the machine produced " + machinePerformance +
                " pieces of bottles");

        byte day = 1;
        int minutes1 = (day * 24) * 60;
        int machinePerformance1 = (minutes1 / 2) * 16;
        System.out.println("For " + minutes1 + " minutes the machine produced " + machinePerformance1 +
                " pieces of bottles");

        byte day1 = 3;
        int minutes2 = (day1 * 24) * 60;
        int machinePerformance2 = (minutes2 / 2) * 16;
        System.out.println("For " + minutes2 + " minutes the machine produced " + machinePerformance2 +
                " pieces of bottles");

        byte month = 1;
        int day2 = month * 30;
        int minutes3 = ((day2 * 24) * 60);
        int machinePerformance3 = (minutes3 / 2) * 16;
        System.out.println("For " + minutes3 + " minutes the machine produced " + machinePerformance3 +
                " pieces of bottles");


        //task 5
        System.out.println("task 5");
        byte totalPaint = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int totalClass = totalPaint / (whiteColor + brownColor);
        int totalWhite = totalClass * whiteColor;
        int totalBrown = totalClass * brownColor;
        System.out.println("In a school with " + totalClass + " classes, you will need " + totalWhite +
                " cans of white paint and " + totalBrown + " cans of brown paint");


        //task 6
        System.out.println("task 6");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int gramWeight = (5 * bananas) + (2 * milk) + (2 * iceCream) + (4 * eggs);
        float kgWeight = gramWeight / 1000f;
        System.out.println(gramWeight + " Gram");
        System.out.println(kgWeight + " Kg");


        //task 7
        System.out.println("task 7");
        byte loseWeight = 7;
        byte neededDay = (byte) ((loseWeight * 1000) / 250);
        byte neededDay1 = (byte) ((loseWeight * 1000) / 500);
        byte averageValue = (byte) ((neededDay + neededDay1) / 2);
        System.out.println("Sportsmen needs " + neededDay + " days if he to loses weight by 250 gram. " +
                "Sportsmen needs " + neededDay1 + " days if he to loses weight by 500 gram, average " +
                averageValue + " days!");


        //task 8
        System.out.println("task 8");
        int mariSalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        byte increasePerYear = 10;
        int mariIncreases = ((mariSalary * increasePerYear) / 100) + mariSalary;
        int denIncreases = ((denSalary * increasePerYear) / 100) + denSalary;
        int krisIncreases = ((krisSalary * increasePerYear)) / 100 + krisSalary;
        System.out.println("Mari now receives " + mariIncreases + " rubles. Annual income " +
                "increased by " + ((mariIncreases - mariSalary) * 12) + " rubles.");
        System.out.println("Den now receives " + denIncreases + " rubles. Annual income " +
                "increased by " + ((denIncreases - denSalary) * 12) + " rubles.");
        System.out.println("Kris now receives " + krisIncreases + " rubles. Annual income " +
                "increased by " + ((krisIncreases - krisSalary) * 12) + " rubles.");
    }}