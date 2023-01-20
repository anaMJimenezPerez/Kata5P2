package kata5_P2.main;

import kata5_P2.view.HistogramDisplay;
import kata5_P2.view.MailHistogramBuilder;
import kata5_P2.model.Mail;
import kata5_P2.model.Histogram;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5_P2.view.MailListReaderBD;

public class Kata5P2 {
    public static void main(String[] args) throws IOException {
        String fileName = "email.txt";
        ArrayList<String> emails = new ArrayList<>();
        MailListReaderBD leer = new MailListReaderBD();
        List<Mail> mails = leer.read();
        for (Mail mail : mails) {
            emails.add(mail.toString());
        }
        
        Histogram histogram = MailHistogramBuilder.build(mails);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}