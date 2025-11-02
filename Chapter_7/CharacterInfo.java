package Chapter_7;

public class CharacterInfo {
    
    public static void main(String[] args) {

    char Char = 'C';

    System.out.println("The character is " + Char);

    if (Character.isUpperCase(Char)) {
        System.out.println(Char + " is uppercase");
    } else { System.out.println(Char + " is not uppercase");}

    if (Character.isLowerCase(Char)){
        System.out.println(Char + " is lowercase");
    }else{ System.out.println(Char + " is not lowercase"); }

    
    System.out.println("After toLowerCase(), Char is " + Character.toLowerCase(Char));
    System.out.println("After toUpperCase(), Char is " + Character.toUpperCase(Char));


    if (Character.isLetterOrDigit(Char)) {
        System.out.println(Char + " is a letter or digit");
    } else {System.out.println(Char + " is not a letter or digit");}

    if (Character.isWhitespace(Char)) {
        System.out.println(Char + " is whitespace");
    } else {System.out.println(Char + " is not whitespace");}

    }

}