package com.senacor.devcon.talk;

/**
 * Created by mblume on 11.06.17.
 */
public abstract class PrintableTalk implements Talk{

    @Override
    public String toString() {
        return getAbstract();
    }
}
