import java.util.Scanner;

public class HttpImageStatusCli {
    private final HttpStatusImageDownloader dowloader;
    private static int client_input;

    public HttpImageStatusCli(){
        dowloader = new HttpStatusImageDownloader();
    }
    public void askStatus(){
        System.out.println("Enter HTTP status code: ");
        Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()){
                client_input = sc.nextInt();
            }else{
                System.out.println("Please enter valid number!");
            }
        try{
            dowloader.downloadStatusImage(client_input);
        }catch(Exception e){
            System.out.println("There is not image for HTTP status " + client_input);
        }
    }
}
