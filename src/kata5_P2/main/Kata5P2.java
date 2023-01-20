package kata5_P2.main;

import kata5_P2.view.HistogramDisplay;
import kata5_P2.view.MailListReader;
import kata5_P2.view.MailHistogramBuilder;
import kata5_P2.model.Mail;
import kata5_P2.model.Histogram;
import java.io.IOException;
import java.util.List;

public class Kata5P2 {
    public static void main(String[] args) throws IOException {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}