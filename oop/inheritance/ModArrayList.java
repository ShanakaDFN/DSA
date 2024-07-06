package oop.inheritance;

import java.util.ArrayList;

public class ModArrayList<T> extends ArrayList<T> {

    public T getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }
}
