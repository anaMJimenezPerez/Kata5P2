package kata5_P2.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5_P2.model.Mail;

public class MailListReaderBD {
    
    public static List<Mail> read() throws FileNotFoundException, IOException{
        List<Mail> emails = new ArrayList<>();
        String sql ="SELECT * FROM direcc_email";
        String url = "jdbc:sqlite:mail.db";
            
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            // Bucle sobre el conjunto de registros.
            while (rs.next()) {
                emails.add( new Mail (rs.getString("direccion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return emails;
    }
    
}
