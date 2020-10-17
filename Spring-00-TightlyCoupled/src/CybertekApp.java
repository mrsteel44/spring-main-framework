public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMEntor partTime = new PartTimeMEntor();

        Mentor mentor = new Mentor(fullTime,partTime);
        mentor.manageAccount();
    }
}
