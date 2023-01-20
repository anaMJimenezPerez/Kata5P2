package kata5_P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kata5_P2.model.Mail;

public class MailListReader {
    
    private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException{
        List<Mail> mailList = new ArrayList<>();
        File archivo = new File(fileName);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while((linea = br.readLine()) != null){
            if(pattern.matcher(linea).matches()){
                mailList.add(new Mail(linea));
                
            }
        }
        return mailList;
    }
}
