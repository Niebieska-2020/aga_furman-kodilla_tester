package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String sizeStamp;
    private boolean indicate;

    public Stamp(String stampName, String sizeStamp, boolean indicate) {
        this.stampName = stampName;
        this.sizeStamp = sizeStamp;
        this.indicate = indicate;
    }

    public String getStampName() {
        return stampName;
    }

    public String getSizeStamp() {
        return sizeStamp;
    }

    public boolean isIndicate() {
        return indicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return indicate == stamp.indicate &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(sizeStamp, stamp.sizeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, sizeStamp, indicate);
    }
}
