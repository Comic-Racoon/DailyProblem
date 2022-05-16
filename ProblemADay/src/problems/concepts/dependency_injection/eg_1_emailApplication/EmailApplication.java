package problems.concepts.dependency_injection.eg_1_emailApplication;

public class EmailApplication {

    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();

        emailClient.sendEmail("Hey, " + "This is my 1st email message ");
        emailClient.sendEmail("Hey, " + "This is my 2st email message ");
    }
}


/*

    problem with this basic example is whenever we are creating an email client
    class we are creating a basic spell checker class i.e, EmailClient is
    highly dependent on basic spell checker class i.e, we say highly coupled
    it makes hard to maintain the code hard to extend and hard to unitest

    imagine we have created advance spell checker class

    to implement that hear in example 1  we have to manually change the code in enail client class
    ----------------------------------------------------
    public class EmailClient {

    private final AdvanceSpellChecker advanceSpellChecker ;

    EmailClient(){
        this.advanceSpellChecker = new AdvanceSpellChecker();
    }

    void sendEmail (String emailMessage ){
        advanceSpellChecker.checkSpelling(emailMessage);
        // logic to send email
    }
    ---------------------------------------------------
}

*/