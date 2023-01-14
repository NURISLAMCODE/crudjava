import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class JdbcPractice {
   
    public static void main(String[] args) {
    Connection con=null;
    Statement stm;
    PreparedStatement pst;
  // insert

       try {
           Class.forName("java.sql.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
           pst = con.prepareStatement("insert into student(id,name,payment)values(100,'z',550)");
           int query = pst.executeUpdate();
           if (query>0) {
            System.out.println("insert completed");   
           }
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("insert not completed");
       }
//        
//        update
//
//            try {
//           Class.forName("java.sql.Driver");
//           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
//           pst = con.prepareStatement("update student set name='zaman',payment=100 where id=102");
//           pst.executeUpdate();
//            } catch (Exception e) {
//                e.printStackTrace();
//        }
            
//        delete


//        try {
//            Class.forName("java.sql.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
//            pst = con.prepareStatement("Delete from student where id = 800");
//            pst.executeUpdate();
//            System.out.println("Delete Successfull");
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Not Successfull");
//        }
        
        
//        read

//    try {
//            Class.forName("java.sql.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
//            Statement stmt = con.createStatement();
//            ResultSet rs;
// 
//            rs = stmt.executeQuery("SELECT name,payment FROM student WHERE id = 101");
//            while ( rs.next() ) {
//                
//                String name = rs.getString("name");
//                String payment = rs.getString("payment");
//                System.out.println(name);
//                System.out.println(payment);
//            }
//            con.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }



//viwe from relationtional database
//    try {
//            Class.forName("java.sql.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
//            Statement stmt = con.createStatement();
//            ResultSet rs;
// 
//            rs = stmt.executeQuery("SELECT st.name, p.name from student st join product p on st.sid = p.sid;");
//            while ( rs.next() ) {
//                
//                String name = rs.getString("st.name");
//                String payment = rs.getString("p.name");
//                System.out.println(name);
//                System.out.println(payment);
//            }
//            con.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
    
// delete from relationtional database   
    
            try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/azdb","root","nclc123");
            pst = con.prepareStatement("Delete student, product from student inner join product where student.sid = product.sid and student.sid=103");
            pst.executeUpdate();
            System.out.println("Delete Successfull");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not Successfull");
        }
            
//      update
    
    }
 
}