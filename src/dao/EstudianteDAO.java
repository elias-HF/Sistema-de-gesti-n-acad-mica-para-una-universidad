package dao;


import Entity.Estudiante;

/*
Principio DIP
*/
public interface EstudianteDAO {
    void guardar(Estudiante e);
    Estudiante buscar(int id);
}
