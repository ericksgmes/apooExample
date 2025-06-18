package org.example.factory;

public class Factory {
    public static void main(String[] args) {
        StringToFactory stringToUpper = new StringToUpperCaseFactory();
        StringToFactory stringToLower = new StringToLowerCaseFactory();
        System.out.println(stringToUpper.export("This is a String"));
        System.out.println(stringToLower.export("This iS aLso A STRing"));
        StringToFactory stringToCapitalized = new StringToCapitalizedFactory();
        System.out.println(stringToCapitalized.export("this is a very absolutely not capitalized string"));
    }
}
