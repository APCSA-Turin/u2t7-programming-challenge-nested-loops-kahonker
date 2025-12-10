package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
    return the string below for given height=5
    *
    **
    ***
    ****
    *****
               */
    public static String starStaircase(int height){
        String returnString = "";
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= i; j++){
                returnString += "*";
            }
            returnString += "\n";
        }
        return returnString.substring(0, returnString.length() -1);
    }
              /*
    return the string below for given height=5
    *****
    ****
    ***
    **
    *
               */

    public static String starStaircaseReverse(int height){
        String returnString = "";
        for (int i = height; i > 0; i--){
            for (int j = i; j > 0; j--){
                returnString += "*";
            }
            returnString += "\n";
        }
        return returnString.substring(0, returnString.length() - 1);
    }
                /*

    width=5 height=5
    *****
    *   *
    *   *
    *   *
    *****
          */
    public static String emptyBox(int width, int height) {
        String returnString = "";
        for (int i = 1; i <= height; i++){
            if (i == 1 || i == height) {
                for (int j = 1; j <= width; j++) {
                    returnString += "*";
                }
            }
            else{
                for (int j = 1; j <= width; j++){
                    if (j == 1 || j == width){
                        returnString += "*";
                    }
                    else returnString += " ";
                }
            }
            returnString += "\n";
        }
        return returnString.substring(0, returnString.length() -1);
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String returnString = "";
        for (int i = 0; i < rows; i++){
            if (i == 0) returnString += word;
            else {
                returnString += word.substring((i) % word.length());
                returnString += word.substring(0, (i) % word.length());
            }
            returnString += "\n";
        }
        return returnString.substring(0, returnString.length() -1);
    }

}