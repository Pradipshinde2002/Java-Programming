
public class String_methods {
    public static void main(String[] args) {
        String str1="Pradip";
        String str2="Shinde";
        String str4="pradip";
        String str5=" Java";


        //string is equal or not
        if (str1.equals(str2)) {
            System.out.println(str1 + " equals " + str2);
        }
        else {
            System.out.println(str1 + " Not equals " + str2);
        }


        //finding the length of string
        int length=str1.length();
        System.out.println("The length of the string is :"+length);

        //using charAt method
        char ch=str2.charAt(4);
        System.out.println("The position of character 4 is: "+ch);


        //checking the string is equal or not ignoring the case of character
        boolean b1=str1.equalsIgnoreCase(str4);
        System.out.println("this are equals: "+b1);

        //converting a string to lowercase
        String lowercase1=str2.toLowerCase();
        System.out.println("The lowercase of Str2 is :"+lowercase1);

        //converting a string to uppercase
        String uppercase1=str4.toUpperCase();
        System.out.println("The uppercase of str4 is :"+uppercase1);

        //replacing a character in the string
        String replace=str1.replace('a','@');
        System.out.println("The replaced string is: "+replace);

        //remove white spaces at the beginning of the string using TRIM method
        String trim=str5.trim();
        System.out.println("After removing the white space of the string: "+trim);

        //compare a strings is equal or not
        int compare=str1.compareTo(str4);
        System.out.println("The String is: "+compare);

        //index of method
        int index=str2.indexOf('h');
        System.out.println("The index of char h is: "+index);


    }

}
