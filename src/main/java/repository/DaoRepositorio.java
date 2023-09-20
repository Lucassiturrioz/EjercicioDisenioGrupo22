package repository;

import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Setter
public class DaoRepositorio implements Dao {
    private Object type;

    public DaoRepositorio(Object type){
        this.type = type;
    }
    @Override
    public List buscarTodos() {
        CriteriaBuilder builder = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Object> critera = builder.createQuery((Class)this.type);
        critera.from((Class)this.type);
        List<Object> entities = EntityManagerHelper.getEntityManager().createQuery(critera).getResultList();
        EntityManagerHelper.closeEntityManager();

        return entities;
    }


    @Override
    public Object buscar(int id) {
        Object t =  EntityManagerHelper.getEntityManager().find((Class)type, id);
        EntityManagerHelper.closeEntityManager();
        return t;
    }



    @Override
    public void agregar(Object unObjeto) {
        EntityManagerHelper.getEntityManager().getTransaction().begin();
        EntityManagerHelper.getEntityManager().persist(unObjeto);
        EntityManagerHelper.getEntityManager().getTransaction().commit();
        EntityManagerHelper.closeEntityManager();
    }


    @Override
    public void modificar(Object unObjeto) {
        EntityManagerHelper.getEntityManager().getTransaction().begin();
        EntityManagerHelper.getEntityManager().merge(unObjeto);
        EntityManagerHelper.getEntityManager().getTransaction().commit();
        EntityManagerHelper.closeEntityManager();
    }

    @Override
    public void eliminar(Object unObjeto) {
        EntityManagerHelper.getEntityManager().getTransaction().begin();
        Object reattached = EntityManagerHelper.getEntityManager().merge(unObjeto);
        EntityManagerHelper.getEntityManager().remove(reattached);
        EntityManagerHelper.getEntityManager().getTransaction().commit();
        EntityManagerHelper.closeEntityManager();
    }
}

