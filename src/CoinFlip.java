import java.util.Random;


public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new random number generator object
	    Random rand = new Random();

	    // pick a random number between 0 and 1:
	    int n = rand.nextInt(3);
	    if(n == 0){
	    	System.out.println("Heads");

	    }
	    else{
	    	 System.out.println("Tails");
	    }
	    
	    }
	   

	}


