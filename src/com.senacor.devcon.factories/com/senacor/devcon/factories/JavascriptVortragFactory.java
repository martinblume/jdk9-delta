package com.senacor.devcon.factories;

import com.senacor.devcon.talk.PrintableTalk;
import com.senacor.devcon.talk.Talk;
import com.senacor.devcon.talk.TalkFactory;

public class JavascriptVortragFactory implements TalkFactory {

    public Talk create() {
        return new JavascriptTalk();
    }

    private static class JavascriptTalk extends PrintableTalk {

        public String getAbstract() {
            return "Dieser Talk behandelt das Thema Javascript.";
        }
    }
}
