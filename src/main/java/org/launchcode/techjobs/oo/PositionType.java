package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

    public PositionType(String value)  {
        super(value);
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType position = (PositionType) o;
        return getId() == position.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
