package Devam;

public class Palindrom_Sayilar {
    static boolean isPalindrom(int x) {
        int lastNumber, temp, reverseNumber = 0, newNumber;
        temp = x;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        } if (reverseNumber == x)
            return true;
        else
            return false;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(32));

    }
}
