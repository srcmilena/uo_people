package unit_02;

public class IfElseIf {

    public static void main(String[] args) {
        String statusOfViewer = "NonSubscriber";

        if(statusOfViewer.equals("Subscriber")) {
            System.out.println("Thank you for watching and please like and share the video!!!");
        }
        else if(statusOfViewer.equals("NonSubscriber")) {
            System.out.println("Thank you for watching. Please, subscriber to the channel and please like and share the video!!!");
        } else {
            System.out.println("Thank you for watching. Please, visit our channel, subscriber to the channel and please like and share the videos!!!");
        }
    }
}
