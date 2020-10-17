public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMEntor partTimeMEntor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMEntor partTimeMEntor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMEntor = partTimeMEntor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMEntor.createAccount();
    }




}
