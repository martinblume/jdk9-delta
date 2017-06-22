package com.senacor.devcon.schedule;

import com.senacor.devcon.factories.JavaVortragFactory;
import com.senacor.devcon.factories.JavascriptVortragFactory;
import com.senacor.devcon.talk.Talk;
import com.senacor.devcon.talk.TalkFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mblume on 11.06.17.
 */
public class Schedule {

    private final List<Talk> talks;

    private Schedule(List<Talk> talks){
        this.talks = talks;
    }

    public static Schedule create(){
        TalkFactory javaFactory = new JavaVortragFactory();
        TalkFactory javascriptFactory = new JavascriptVortragFactory();
        return new Schedule(Arrays.asList(javaFactory.create(), javascriptFactory.create()));
    }

    @Override
    public String toString() {
        String result = "[";
        result += talks.stream().map(talk -> talk.toString()).reduce("", (a,b) -> a + "," + b);
        result += "]";
        return result;
    }
}
