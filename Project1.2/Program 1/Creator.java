import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;
public class Creator {
    private Integer numRands;
    private ArrayList<Double> list1 = new ArrayList<>(); //creating a private attribute for the random library
    private ArrayList<Double> list2 = new ArrayList<>(); //creating a private attribute for the math library
    private ArrayList<Double> list3 = new ArrayList<>(); //creating a private attribute for the threads library

    public void enterLoop(){
        Scanner myObj = new Scanner(System.in); //creating a scanner object, referenced w3 schools
        boolean run = true;

        while(run){
            System.out.println(" ");
            System.out.println("Enter your desired list length or press enter if you would like the program to end:"); //printing out the statement to enter in an integer
            String userInput = myObj.nextLine();
            if(userInput == ""){
                run = false;
                System.out.println("Null Input, thanks for visiting!"); //when the user enters in a null input
                break;
            }else if(userInput.isEmpty()){

            }
            int castInput = Integer.parseInt(userInput); //casting the string input into an integer
            numRands = castInput;

            list1 = new ArrayList<>(); //dumping the values of the previous array
            list2 = new ArrayList<>();
            list3 = new ArrayList<>();

            generateList1(); //calling the three generate list to generate the random lists
            generateList2();
            generateList3();

            Analyzer a = new Analyzer();
            System.out.println(" ");
            System.out.println("Using the Random library: ");
            a.analyze(list1);

            System.out.println("");
            System.out.println("Using the Math library: ");
            a.analyze(list2);

            System.out.println("");
            System.out.println("Using the ThreadLocalRandom library: ");
            a.analyze(list3);
        }
    }

    public void generateList1(){ //using the first library
        Random rand = new Random(); //creating a random object, referenced from https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java#:~:text=In%20order%20to%20generate%20random,this%20random%20number%20generator%20sequence.

        for(int i = 0; i < numRands; i++){ //for loop to go through and populate the array with
            list1.add(rand.nextDouble()); //appending the rand object to the arraylist in the private attributes
        }
        //System.out.println(list1); //printing out the calculations
    }

    public void generateList2(){ //using the second library, referenced https://stackoverflow.com/questions/11126660/assigning-math-random-value-to-array
        for(int i = 0; i < numRands; i++){ //for loop to go through and populate the array with
            list2.add(Math.random()); //appending the rand object to the arraylist in the private attributes
        }
        //System.out.println(list2); //printing out the calculations
    }

    public void generateList3(){ //using the third library, referenced https://www.baeldung.com/java-thread-local-random
        for(int i = 0; i < numRands; i++){ //for loop to go through and populate the array with
            double threadRand = ThreadLocalRandom.current().nextDouble(); //creating the random variable using the thread.random library
            list3.add(threadRand); //appending the rand object to the arraylist in the private attributes

        }
        //System.out.println(list3); //printing out the calculations
    }
}
