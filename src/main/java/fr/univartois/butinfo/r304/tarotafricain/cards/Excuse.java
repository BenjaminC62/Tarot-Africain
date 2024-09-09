package fr.univartois.butinfo.r304.tarotafricain.cards;

import java.util.Objects;

public class Excuse implements ITrump{

    private Boolean highValue;

    /**
     *
     */
    public Excuse() {
    }

    public void setHighValue(Boolean highValue) {
        this.highValue = highValue;
    }

    public Boolean isHighValue() {
        return highValue;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(highValue);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Excuse{" +
                "HighValue=" + highValue +
                '}';
    }

    /**
     *
     * @param trump
     * @return
     */
    @Override
    public int compareTo(ITrump trump) {
        return 0;
    }

    /**
     *
     * @param trump
     * @return
     */
    @Override
    public int compareTo(NumberedTrump trump) {
        return 0;
    }

    /**
     *
     * @param excuse
     * @return
     */
    @Override
    public int compareTo(Excuse excuse) {
        return 0;
    }
}
