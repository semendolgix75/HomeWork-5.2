//Напишите программу, которая проверяет, является ли строка палиндромом.
//Данное задание решите в простом блокноте или в Google-доке.

public class Main
{
    public static void main(String[] args)
    {
        String testWord="Ежу хуже";
        if (isPalindrome(testWord))
        {
            System.out.println("Word is palindrome");
        }else	{
            System.out.println("Word is not palindrome");
        }

    }

    private static boolean isPalindrome(String testWord)
    {

        testWord=testWord.toLowerCase().replaceAll(" ","");
        boolean result=true;
        for (int i=0;i<testWord.lenght()/2;i++)
        {
            if(testWord.charAt(i)!=testWord.charAt(testWord.lenght()-i-1))
            {
                result=false;
                break;
            }
        }
        return result;
    }
}