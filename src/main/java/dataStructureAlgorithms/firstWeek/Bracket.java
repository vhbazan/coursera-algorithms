package dataStructureAlgorithms.firstWeek;

import java.util.Stack;

/**
 * Created by victor on 29/03/2018.
 */
public class Bracket {

    public String match(String input) {
        String result;
        Stack<CharAndPosition> stack= new Stack<CharAndPosition>();

        if(input.length()==0) {return "0";}
        char current;
        for(int i=0; i<input.length(); i++)  {
            current = input.charAt(i);
            if(current==']' || current==')' || current=='}')  {
                if(stack.isEmpty()) {return Integer.toString(i+1);}
                if(stack.peek().getCharacter()=='[' && current != ']' || stack.peek().getCharacter()=='{' && current != '}'
                        || stack.peek().getCharacter()=='(' && current != ')') {
                    return Integer.toString(i+1);
                }

                if(stack.peek().getCharacter()=='[' && current == ']' || stack.peek().getCharacter()=='{' && current == '}'
                        || stack.peek().getCharacter()=='(' && current == ')') {
                    stack.pop();
                }
            }
            else if(current=='[' || current=='{' || current=='(') {
                stack.push(new CharAndPosition(current, i));
            }
        }
        if(stack.isEmpty()) {result = "Success";}
        else {result = Integer.toString(stack.peek().getPostion());}

        return result;
    }

    class CharAndPosition {
        private char character;
        private int position;

        CharAndPosition (char character, int position) {
            this.character = character;
            this.position = position+1;
        }

        public char getCharacter() {
            return this.character;
        }
        public int getPostion () {
            return this.position;
        }
    }
}
