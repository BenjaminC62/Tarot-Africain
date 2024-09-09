package fr.univartois.butinfo.r304.tarotafricain.cards;

public enum NumberedTrump implements ITrump {

    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRDTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN, NINETEEN, TWENTY, TWENTY_ONE;


    @Override
    public int compareTo(ITrump trump) {
        return 0;
    }

    @Override
    public int compareTo(Excuse excuse) {
        return 0;
    }
}
