import java.util.ArrayList;
public class Analyzer {
    private double calcMean(ArrayList<Double> lists){ //calculating the mean of the random array, referenced https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers
        double sum = 0; //creating the sum variable
        double mean; //creating the mean variable
        for(int i = 0; i < lists.size(); i++ ){
            sum += lists.get(i); //getting the index of the list
        }

        mean = sum/lists.size(); //basic mean calculation
        return mean;

    }

    private double calcSD(ArrayList<Double> lists ){ //calculating the standard deviation, referenced https://www.programiz.com/java-programming/examples/standard-deviation
        double standDeviation = 0; //initializing sd at 0
        double mean = calcMean(lists); //calling the mean function

        for(int i = 0; i < lists.size(); i++){
            standDeviation += Math.pow(lists.get(i) - mean, 2.0);
        }

        return Math.sqrt(standDeviation/lists.size());
    }

    private double calcMin(ArrayList<Double> lists){ //calculating the min of the random array, referenced https://stackoverflow.com/questions/28569181/finding-min-element-in-an-array
        double min = lists.get(0); //getting the index of the array
        for(int i = 0; i < lists.size(); i++){
            if(lists.get(i) < min){
                min = lists.get(i); //getting the min value
            }
        }
        return min;
    }

    private double calcMax(ArrayList<Double> lists){ //calculating the max of the random array, opposite of min
        double max = lists.get(0);
        for(int i = 0; i < lists.size(); i++){
            if(lists.get(i) > max){
                max = lists.get(i); //getting the max value
            }
        }
        return max;
    }
    public void analyze(ArrayList<Double> list){
        Double mean = calcMean(list); //creating different Double variables and using them to call the functions above when calculating the different values
        Double sd = calcSD(list);
        Double max = calcMax(list);
        Double min = calcMin(list);
        //print statements
        System.out.println("Standard Deviation: " + sd);
        System.out.println("Mean: " + mean);
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }

}
