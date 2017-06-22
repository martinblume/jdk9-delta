package com.senacor.devcon.factories;

import com.senacor.devcon.talk.PrintableTalk;
import com.senacor.devcon.talk.Talk;
import com.senacor.devcon.talk.TalkFactory;

public class JavaVortragFactory implements TalkFactory {

    public Talk create() {
        return new JavaTalk();
    }

    private static class JavaTalk extends PrintableTalk {

        public String getAbstract() {
            return "Dieser Talk behandelt das Thema java 9.";
        }
    }
}
