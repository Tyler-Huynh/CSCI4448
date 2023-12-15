import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
public class Reader {
    private ArrayList<String> s1 = new ArrayList<>(); //creating 6 different array lists
    private ArrayList<String> clue = new ArrayList<>(); //creating 6 different array lists


    public void genString(){
        s1.add("minecraft"); //adding in the strings, referenced https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
        s1.add("robots");
        s1.add("printer");
        s1.add("starwars");
        s1.add("flash");
        s1.add("runner");
        //System.out.println("ArrayList : " + s1);
        s1.replaceAll(String::toUpperCase); //converting the strings to uppercase, referenced https://vk4u.wordpress.com/2019/10/08/convert-string-elements-of-a-arraylist-to-lower-uppercase-case-in-a-java/
        //System.out.println("UpperCase version of ArrayList : " + s1);

        clue.add("blocks from 2009 game"); //the hints for each of the words above
        clue.add("roomba go clean");
        clue.add("a machine made to waster ink and paper");
        clue.add("R2D2");
        clue.add("dc superhero who runs really fast");
        clue.add("working out by moving fast");

        Tokenizer t = new Tokenizer(); //creating a new object to call our tokenizer function

        ArrayList<String> foundToken = t.tokensFound(s1); //creating a new arraylist of strings that hold tokenized strings
        Collections.shuffle(foundToken); //randomizing the tokens array list, referenced https://www.geeksforgeeks.org/shuffle-or-randomize-a-list-in-java/
        //System.out.println("Here are your new tokenized strings!" + foundToken);
        System.out.println("Tokens: ");
        for(int i = 0; i < foundToken.size(); i++){ //traversing over the randomnized token list
            System.out.print(foundToken.get(i) + " "); //printing out the tokens in table format
            if((i+1) % 4 == 0){
                System.out.println(" ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Clues: " + clue); //printing out the clues
        System.out.println("");
        System.out.println("Answer Key " + s1); //printing out the answer key
    }
}
