package problems.concepts.dependency_injection.eg_1_emailApplication;

public class EmailClient {

    private final BasicSpellChecker basicSpellChecker;

    EmailClient(){
        this.basicSpellChecker = new BasicSpellChecker();
    }

    void sendEmail (String emailMessage ){
        basicSpellChecker.checkSpelling(emailMessage);
        // logic to send email
    }
}
