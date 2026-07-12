package dao;


import Entity.Estudiante;


/*
Principio SRP
 */
public class EstudianteDAOImpl implements EstudianteDAO{
    EntityManager em;
    
    @Override
    public void guardar(Estudiante e) {
        em.getTransaction().begin();

        em.persist(e);

        em.getTransaction().commit();
    }

    @Override
    public Estudiante buscar(int id) {
        System.out.println("Buscando en la Base de Datos...");
        //por ahora, ya que no esta concetado a la base de datos todavia.
        return null;
    }
    
}
