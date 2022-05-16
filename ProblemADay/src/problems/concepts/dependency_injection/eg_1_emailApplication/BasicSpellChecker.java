package problems.concepts.dependency_injection.eg_1_emailApplication;

public class BasicSpellChecker {

    public void checkSpelling(String emailMessage){
        if(emailMessage != null){
            System.out.println("check-ing spelling");
            System.out.println("Spell check-ing completed ");
        }
        else{
            throw new RuntimeException("an exception occur ");
        }
    }
}
