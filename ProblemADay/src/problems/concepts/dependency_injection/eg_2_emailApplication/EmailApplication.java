package problems.concepts.dependency_injection.eg_2_emailApplication;

    public class EmailApplication {

        public static void main(String[] args) {
            EmailClient emailClient = new EmailClient(new BasicSpellChecker());
            EmailClient emailClient2 = new EmailClient(new AdvanceSpellChecker());

            emailClient.sendEmail("Hey, " + "This is my 1st email message ");
            emailClient.sendEmail("Hey, " + "This is my 2st email message ");
        }
    }



    /*

    hear we are provideing dependencies in the email client class
        instead of creating it directly
    */