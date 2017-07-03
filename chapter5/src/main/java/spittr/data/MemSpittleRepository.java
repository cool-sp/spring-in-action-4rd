package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemSpittleRepository implements SpittleRepository {
    private List<Spittle> spittles = new ArrayList<Spittle>();

    public List<Spittle> findRecentSpittles() {
        return spittles;
    }

    public List<Spittle> findSpittles(long max, int count) {
        return spittles;
    }

    public Spittle findOne(long id) {
        for (Spittle sp : spittles) {
            if (sp.getId() == id)
                return sp;
        }
        return null;
    }

    public void save(Spittle spittle) {
        spittles.add(spittle);
    }
}
