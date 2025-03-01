/**
This class is to determine if a string is a palindrome (asme fowards a backwards by item not letter)
@author Ta'Rissa Woods
@ version %I% %G%
*/

/**
imports basically any array or list related modules
*/
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;



public class PalinList{
/**
instant variables are the queue and the stack used throughout the class
*/
	private Queue<String> queue;
	private Stack<String> stack;
/**
unparameterize constructor for the PalinList class slightly unnecessary as you need a parameter check for palindrome
*/
	public PalinList()
	{
	    String setString= "racecar is racecar";
	    queue = new LinkedList<>();
	    stack = new Stack<>();
	    String[] words = setString.split(" ");
	    queue.addAll(Arrays.asList(words));
	    for (int j = 0; j < words.length; j++){
	        stack.push(words[j]);
	    }
		
	}
/**
perimeterized constructor That initializes the queue and stack use throughout the class then it takes the string 
that was put in the parameter and turns it into a list and then adds that list to the queue and stack
*/
	public PalinList(String list)
	{
	    queue = new LinkedList<>();
	    stack = new Stack<>();
	    String[] wordList = list.split(" ");
	    queue.addAll(Arrays.asList(wordList));
	    for (int j = 0; j < wordList.length; j++){
	        stack.push(wordList[j]);
	    }
	}
/**
method to set the string to a however this method is also unnecessary because the string is not a instance variable
Therefore it cannot be mutated in that way. The initializing of the queue and the stack needs to have an in the constructor 
as well as adding string turned list into the queue and the stack. The constructor does this method already making it unnecessary
@param string that will be turned into a list
*/
	public void setList(String list)
	{
	    list = list;
	}
/**
Method to check if the string would be considered a palindrome. Because queues are naturally suited forward and stacks are naturally sorted in 
reverse The message checks the first of the queue and the last of the stack removing and poppingto see if the elements match
match. To ensure the original queue and stack stay as they were, clones were made
@return if the queue and the stack match all the way through then the list is a palindrome and will return true otherwise false
*/
	public boolean isPalin()
	{
	    Queue<String> modQueue = new LinkedList<>();;
    	Stack<String> modStack = (Stack<String>) stack.clone();;
    	modQueue.addAll(queue);
	    boolean isPal = false;
	    for(int i = 0; i < modQueue.size(); i++){
	        if(modQueue.remove().equals(modStack.pop())){
	            isPal =  true;
	        }
	        else{
	            isPal =  false;
	        }
	    }
	    return isPal;
	}

/**
two-string method to print the queue And if it's a palindromebased off of the results from isPalin() method
*/
    public String toString(){
        String results = " ";
        if (isPalin() == true){
            results = queue + " is a palinlist";
        }
        else{
            results = queue + " is not a palinlist";
        }
        return results;
    }
}
