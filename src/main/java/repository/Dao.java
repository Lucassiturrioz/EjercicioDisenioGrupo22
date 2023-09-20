package repository;

import java.util.List;

public interface Dao<T> {
    List<T> buscarTodos();
    T buscar(int id);
    void agregar(Object unObjeto);
    void modificar(Object unObjeto);
    void eliminar(Object unObjeto);

}
