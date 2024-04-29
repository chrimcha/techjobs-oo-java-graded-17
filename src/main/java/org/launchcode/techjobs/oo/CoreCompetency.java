package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value)  {
        super(value);
    }

    @Override
    public boolean equals(Object o) { // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency competency = (CoreCompetency) o;
        return getId() == competency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
