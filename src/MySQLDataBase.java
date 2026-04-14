/*
 Principio DIP
 */
public class MySQLDataBase implements DataBase{

    @Override
    public void conectar() {
        System.out.println("Conectandose a MySQL...");
    }
    
}
