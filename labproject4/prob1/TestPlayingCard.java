package labproject4.prob1;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Your name:Bezborodov Dmitry
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCard
{
    public static void main(String[] args)
    {
        // 1 - Construct an array of 52 PlayingCard objects called deck.
    	PlayingCard [] deck = new PlayingCard[52];




        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).
    	for (int i = 0; i < 13; i++) {
    		
    		for (int j = 0; j < 4; j++) {
    			
    			deck[i*4+j] = new PlayingCard(i+1,j+1);
    		}
    	}
        



        // 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loop.
        for (int i = 0; i < 13; i++) {
    		
    		for (int j = 0; j < 4; j++) {
    			
    			System.out.println(deck[i*4+j]);
    		}
    	}

    	
    	//ArrayList
        System.out.println("ArrayList: ");
    	
        
        ArrayList<PlayingCard> deckL = new ArrayList<>();
    	
        
    	for (int i = 1; i <= 13; i++) {
    		
    		for (int j = 1; j <= 4; j++) {
    			
    			deckL.add(new PlayingCard(i,j));
    		}
    	}
    	
    	for (int i = 0; i < 13; i++) {
    		
    		for (int j = 0; j < 4; j++) {
    			
    			System.out.println(deckL.get(i*4+j));
    		}
    	}
    	
    	
    	Collections.shuffle(deckL);

    	
    	System.out.println("Shuffled deck: ");
    	
    	for (int i = 0; i < 13; i++) {
    		
    		for (int j = 0; j < 4; j++) {
    			
    			System.out.println(deckL.get(i*4+j));
    		}
    	}
    }
}
