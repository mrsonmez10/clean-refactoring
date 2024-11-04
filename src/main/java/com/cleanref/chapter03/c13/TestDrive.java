package com.cleanref.chapter03.c13;

// Talk about proper log
public class TestDrive{

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        //registry.deleteReference(page.name);
        //configKeys.deleteKey(page.name.makeKey());
    }


    private void logError(Exception e) {
        System.out.println("Log error!");
    }


    public void deletePage(Page page){

    }

}
