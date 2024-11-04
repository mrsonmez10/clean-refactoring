package com.cleanref.chapter03.c02;

public class BadExample {

    private HelperClass helperClass;

    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){
            /*

             */
            helperClass.getButtonAnswer();
        }
        String nlpResult = helperClass.nlpEngine();
        /*
            Do stuff...
         */
        helperClass.getAnswer(nlpResult);
    }

}
