package Section_29_Control_Flow_Statements.Challenge.Lesson_473_WhileAndDoWhileStatementsChallenge;

public class Main {
    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count != 6);


//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }


        //FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + count);
//        }


        //FOR LOOP IS IDENTICAL TO THE ABOVE WHILE LOOP:
//        for (count = 1; count !=6 ; count++) {
//            System.out.println("Count value is " + count);
//        }



//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

//**********************************************************************************************************************
        // It's My solution:
//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                count++;
//                if (count > 5){
//                    break;
//                }
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }
//**********************************************************************************************************************

        // It's Solution Tim Buchalka:
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number){

        // It's My solution:
        while (number % 2 == 0){
            return true;
        }
        return false;


        // It's Solution Tim Buchalka:
//        if (number % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
    }
}