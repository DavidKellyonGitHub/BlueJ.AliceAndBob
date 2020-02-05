
/**
 * Public class AliceAndBobEngine is used to create the method "evaluateAliceOrBob" which checks
 * if the input matches either of the names "Alice" or "Bob."
 * If it does, the method returns "Hello Alice" or "Hello Bob" respectively.
 * If input does not match, the method returns "I DON'T KNOW YOU, YOU ARE SCARY"
 *
 * @Dave Kelly
 * @02/5/20
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input.equals("Alice")) {
            return "Hello Alice";
        } else if (input.equals("Bob")) {
            return "Hello Bob";
        } else {
            return "I DON'T KNOW YOU, YOU ARE SCARY";
        }
   
        
    }
}
