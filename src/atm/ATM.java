
package atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ATM {
    
    static Connection c;
    static PreparedStatement s;
    static String query;
    static ResultSet r;
    
    public static  void insert() throws SQLException{
         Scanner input=new Scanner(System.in);
         
        System.out.print("enter your passsword : ");
            String password= input.next();
            System.out.print("enter your e_mail : ");
            String e_mail= input.next();
            System.out.print("enter your money : ");
            int money= input.nextInt();
        query="insert into cust values('"+password +"','"+e_mail +"','"+money +"')";
        s=c.prepareStatement(query);
        s.execute(query);
    }
    public static void delete(String v1) throws SQLException{
        query="delete from cust where pass='"+v1+"'";
        s=c.prepareStatement(query);
        s.execute(query);
        System.out.println("data is deleted !! ");
    } 
    public static void update(String v1,String v2) throws SQLException{
        query="update cust set mon=mon+'"+v2+"' where pass='"+v1+"'";
        s=c.prepareStatement(query);
        s.execute(query);
        System.out.println("data is updated !! ");
    }
    public static void update_account(String v,String v1,int v2,String v3) throws SQLException{
        query="update cust set pass='"+v1+"', mon='"+v2+"',email='"+v3+"' where pass='"+v+"'";
        s=c.prepareStatement(query);
        s.execute(query);
        System.out.println("Account is updated !! ");
    }
    
   public static void print_mon(String v) throws SQLException{
       query="select mon from cust where pass='"+v+"'";
       s=c.prepareStatement(query);
       r=s.executeQuery(query);
       r.next();
       System.out.println( "your mony is : "+r.getString("mon"));
   }
    public static void print_data(String v) throws SQLException{
       query="select mon,email,pass from cust where pass='"+v+"'";
       s=c.prepareStatement(query);
       r=s.executeQuery(query);
       r.next();
       
       System.out.println( "your data ****************");
       System.out.println( "Password is : "+r.getString("pass"));
       System.out.println( "E_mail is : "+r.getString("email"));
       System.out.println( "Money is : "+r.getString("mon"));
       System.out.println( "**************************");
   }
    
    public static void main(String[] args) throws SQLException {
        Scanner input=new Scanner(System.in);
        Sec c1= new Sec();
        try{
            c=c1.connect();
            //query="create table cust(pass varchar(30) not null,email varchar(30) not null,mon int not null,constraint pk primary key(pass))";
            
            print_data("asd");
               
          //  insert();
 //           delete("555");
 //         update_account("12345","010", 10000000,"sama@321");
//            //print_mon("12345");
//            System.out.println("Operation successfuly");
//            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
//        finally{
//            try{
//                c.close();
//                s.close();
//                r.close();
//            }catch(SQLException ee){
//                System.out.println(ee.getMessage());
//            }
//        }
    }
    
}
