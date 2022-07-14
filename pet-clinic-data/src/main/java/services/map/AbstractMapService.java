package services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {

    protected Map<ID,T> map=new HashMap<>();

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }
    T findById(ID id)
    {
        return map.get(id);
    }
    T save(ID id,T object)
    {
        map.put(id,object);
        return object;
    }
    void deleteById(ID id)
    {
        map.remove(id);
    }
    void deleteByObject(T object)
    {
//        int id;
//        for(int i=0;i<map.size();i++)
//        {
//            if(object==map.get(i)) {
//                id = i;
//                map.remove(id);
//            }
//        }

        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
