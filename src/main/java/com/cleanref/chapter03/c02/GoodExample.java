package com.cleanref.chapter03.c02;

public class GoodExample {

    private HelperClass helperClass;

    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (!checkNlpNeed(channelRequest)){
            helperClass.getButtonAnswer();
        }
        getAnswerWithNlpEngine(channelRequest);
    }

    public boolean checkNlpNeed(ChannelRequest channelRequest) {
        if (channelRequest.isEarlyControl() && channelRequest.isPostback()) {
            return false;
        }
        return true;
    }

    public void getAnswerWithoutNlpEngine(ChannelRequest channelRequest) {
        helperClass.getEarlyAnswer();
    }

    public void getAnswerWithNlpEngine(ChannelRequest channelRequest) {
        String nlpResult = helperClass.nlpEngine();
        helperClass.getAnswer(nlpResult);
    }

}
