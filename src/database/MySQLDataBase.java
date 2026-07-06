package database;

/*
 Principio DIP
Patron Singlethon
 */
public class MySQLDataBase implements DataBase{
    
    private static MySQLDataBase instancia;
    
    private MySQLDataBase(){}
    
    public static MySQLDataBase getInstancia(){
        if(instancia == null){
            instancia = new MySQLDataBase();
        }
        return instancia;
    }
    
    @Override
    public void conectar() {
        System.out.println("Conectandose a MySQL...");
    }
    
}
