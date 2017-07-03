package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemSpitterRepository implements SpitterRepository {
    private List<Spitter> spitters = new ArrayList<Spitter>();

    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    public Spitter findByUsername(String username) {
        for (Spitter sp : spitters) {
            if (sp.getUsername().equals(username)) {
                return sp;
            }
        }
        return null;
    }
}
