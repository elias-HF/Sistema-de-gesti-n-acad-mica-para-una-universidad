package database;

import java.sql.Connection;


/*
 Principio DIP
Patron Singlethon
 */
public class MySQLDataBase implements DataBase{
    
    private static MySQLDataBase instancia;
    
    private Connection conexion;
    
    private MySQLDataBase(){}
    
    public static MySQLDataBase getInstancia(){
        if(instancia == null){
            instancia = new MySQLDataBase();
        }
        return instancia;
    }
    
    @Override
    public void conectar() {
         try{

            conexion = AccesoDB.getConnection();

            System.out.println("Conexión exitosa a MySQL.");

        }catch(Exception e){

            System.out.println("Error al conectar.");

            e.printStackTrace();

        }
    }
    
    public Connection getConexion(){

        return conexion;

    }
    
}
