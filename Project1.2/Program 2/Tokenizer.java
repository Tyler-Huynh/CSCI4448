import java.util.ArrayList;
public class Tokenizer {
    public ArrayList<String> tokensFound(ArrayList<String> result){
        ArrayList<String> toke = new ArrayList<>();
        String s2 = "";
        for(int i = 0; i < result.size(); i++){ //traversing over the array of strings
            s2 = result.get(i); //grabbing the index in the list
            for(int j = 0; j < s2.length(); j+=2){ //going through each char of string
                if(s2.length() % 2 != 0 && j == s2.length() - 3){ //if the string is odd and the index is on the 3rd to the last index
                    if(j != s2.length() - 1 && j != s2.length() - 2) { //if we are not at the end of the index and 2nd to last index of the string
                        String token = s2.substring(j, j + 3); //tokenizing the string itself and accounting for if its odd
                        //System.out.println(token);
                        toke.add(token); //adding the string to our toke arraylist
                    }
                }else{ //for even strings
                    if(j != s2.length() - 1){ //if the string is not at the last index
                        String tokenEven = s2.substring(j, j+2); //same as above but for even strings
                        //System.out.println(tokenEven);
                        toke.add(tokenEven);
                    }

                }
            }
        }
        return toke; //returning the tokenized strings
    }

}
