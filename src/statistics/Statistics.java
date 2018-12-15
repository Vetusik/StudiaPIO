package statistics;

import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("unused")
public interface Statistics {
    
    /**
     * Dopisuje punkt wskazanemu graczowi.
     * 
     * @param name 
     */
    void andTheWinnerIs(String name);
    
    /**
     * Wy�wietla statystyki.
     */
    void print();
    
    /**
     * Zeruje statystyki.
     */
    public void reset();
}