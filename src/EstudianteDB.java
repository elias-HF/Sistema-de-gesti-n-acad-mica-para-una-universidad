/*
Principio DIP
*/
public interface EstudianteDB {
    void guardar(Estudiante e);
    Estudiante buscar(int id);
}
