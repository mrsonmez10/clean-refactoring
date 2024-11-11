package com.cleanref.chapter03.c02;

public class BadExample {

    private HelperClass helperClass;

    public String getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){
            /*

             */
            return helperClass.getButtonAnswer();
        }
        String nlpResult = helperClass.nlpEngine();
        /*
            Do stuff...
         */
        return helperClass.getAnswer(nlpResult);
    }

}
