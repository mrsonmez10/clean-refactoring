package com.cleanref.chapter08.c06;

public class IncorrectFileNameException extends Exception {

    // Checked
    public IncorrectFileNameException(String errorMessage, Throwable asdasf) {
        super(errorMessage);
    }


//	try (Scanner file = new Scanner(new File(fileName))) {
//    if (file.hasNextLine()) {
//        return file.nextLine();
//    }
//} catch (FileNotFoundException err) {
//    if (!isCorrectFileName(fileName)) {
//        throw new IncorrectFileNameException("Incorrect filename : " + fileName , err);
//    }
//}

}