package nl.gridshore.ff2015.data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jettrocoenradie on 06/11/14.
 */
@Entity
public class Player {
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
