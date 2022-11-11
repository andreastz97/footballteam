import java.sql.*;

public class NewClass {
   static String     driverClassName = "org.postgresql.Driver"  ;
    static String  url =  "jdbc:postgresql://dblabs.it.teithe.gr:5432/it154547";
    static Connection dbConnection = null;
    static String username = "it154547";
    static String passwd = "486267";
    static ResultSet rs = null;
    static Statement  stmt = null;
    static PreparedStatement  insertBoats = null;
    
    static PreparedStatement  prstatement  = null;
    
    static ParameterMetaData paramInfo = null;

    /**
     *
     * @param argv
     * @throws java.lang.Exception
     */
    public static void main (String[] argv) throws Exception{
          Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);

        stmt    = dbConnection.createStatement();
        
             String insertString = "insert into Boats (bid, bname, color) values (?, ?, ?)";
        System.out.println("-----------------");        
        System.out.println(insertString);        
        prstatement = dbConnection.prepareStatement(insertString);
        paramInfo = prstatement.getParameterMetaData();
        int NumberOfParameters = paramInfo.getParameterCount();
        System.out.println("Number of parameters: "+NumberOfParameters);
        for (int i=1;i<NumberOfParameters+1;i++) {
            String typeName = paramInfo.getParameterTypeName(i); 
            System.out.println("Type of parameters: "+typeName);         
        } 
          
        stmt.close();
        dbConnection.close();

    }
}
