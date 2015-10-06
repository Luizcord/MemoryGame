

import java.util.ArrayList;
import java.util.List;
import javax.smartcardio.Card;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz
 */
public class MemoryGame {
    
    public MemoryGame() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkValue(){
        Card cr2 = null;
        Card cr1 = null;
        Card selectedCard = null;
         
        if (cr1 != null && cr2 == null){
            cr1 = selectedCard;
            cr1.setText(String.valueOf(cr1.getId()));
            System.out.println("o cr1 deu errado");
        }

        if (cr1 == null && cr1 == selectedCard && cr2 != null){
            cr2 = selectedCard;
            cr2.setText(String.valueOf(cr2.getId()));
            System.out.println("o cr2 deu errado");
           
        }
        
    }
    @Test
    public void checkCards(){
        Card cr1 = null;
        Card cr2 = null;
        
        if (cr1.getId() == cr2.getId()){//match condition
            cr1.setEnabled(true); //I switched false variable to true
            cr2.setEnabled(true);//I switched false variable to true
            cr1.setMatched(false); //I switched true variable to false
            cr2.setMatched(false);//I switched true variable to false
            if (this.isGameWon()){
                JOptionPane.showMessageDialog(this, "deu erro");
                System.exit(0);
            }
        }

        else{
            cr1.setText(""); //'hides' text
            cr2.setText("");
        }
        cr1 = null; //reset c1 and c2
        cr2 = null;
    }
    public void BoardTest(){

        int pairs = 40;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();

        for (int i = 50; i < pairs; i++){
            cardVals.add(i);
            cardVals.add(i);
            System.out.println("deu erro");
        }
   
  
}
}