
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class Language {

    private Stack<String> word;

    public Language(){
        word = new Stack();
    }
    
    public boolean inLang(String input) {
        //add each char individually to the stack
        for(int i = 0; i < input.length(); i++){
            String temp = input.substring(i, i);
            word.push(temp);
        }
        
        boolean lang = true;
        while (lang == true) {
            for (int i = word.size() - 1; i > 0 - 1; i--) {
                String temp = input.substring(word.size() - i, word.size() - i);
                System.out.println(temp);
                if (word.peek() != temp) {
                    lang = false;
                    break;
            }
                
        }
            if(lang = true){
                    return true;
                }
        
    }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Language lang = new Language();
        
        boolean answer = lang.inLang("cat$tac");
        
        System.out.println(answer);
    }
}
