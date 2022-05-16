package problems.concepts.dependency_injection.eg_2_emailApplication;

import problems.concepts.dependency_injection.eg_1_emailApplication.BasicSpellChecker;

public class EmailClient {

    private SpellChecker spellChecker;

    EmailClient(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    void sendEmail (String emailMessage ){
        spellChecker.checkSpelling(emailMessage);
        // logic to send email
    }

}
