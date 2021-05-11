/*Hetvi Patel
This program gives user two options to perform in their program. Option 1 is sentence analyzer which analysis the
sentence on the basis of perios, exclamatory mark and question mark used at the end of a sentence. The other is Option 2 which
is probable season and return the season according to the temperature the user enters.
03/10/2020*/
import java.util.Scanner;
public class SentenceAnalyzer
{
    /*this method run, asks the user how many times does he oe she wants to run the program and accordingly
    runs the program. It then compares the string entered by the user and accordingly returns the method.*/ 
    public static void run(Scanner kb)
    {
         System.out.print("\nHow many times do you want to run this program? ");
         int no = kb.nextInt();
         for(int i=1;i<=no;i++)
         {
             //System.out.print("count: " + i);
             String s1 = getOption(kb);
             String s2 = new String("Sentence analyzer");
             String s3 = new String("Probable Season");
             if(s1.equalsIgnoreCase(s2))  
             {
                 System.out.print("Enter a sentence: ");
                 String sentence = kb.nextLine(); 
                 sentenceAnalyser(sentence); 
             }
             else if(s1.equalsIgnoreCase(s3))
             {
                 System.out.print("Enter a temperature in Fahrenheit: ");
                 double temperature = kb.nextDouble();
                 probableSeason(temperature);
             }
             else
             {
                 System.out.print("unknown choice");
             }
         }
    }
    //this method gives user options ans asks to choose one and then returns the choice to the run method
    public static String getOption(Scanner kb) 
    {
       System.out.print("\nChoose one of the following options: ");
       System.out.print("\n1.Sentence analyzer");
       System.out.print("\n2.Probable Season");
       System.out.print("\nEnter your option--> ");
       kb.nextLine();
       String choice = kb.nextLine();
       return choice;
    }
    /*this method runs when the user chooses sentence analyzer. it checks the last character of the entered sentence 
    and then returns the type accordingly. If its a period, it returns "declarative", if a exclamatory mark, it return "exclamatory" 
    and if a question mark then returns "iterrogative". It then returns the type.*/
    public static String sentenceAnalyser(String sentence) 
    {
       String type;
       int len = sentence.length();
       if(sentence.charAt(len-1)=='.')
       {
           type="a declarative";
       }
       else if(sentence.charAt(len-1)=='?')
       {
           type="an interrogative";
       }
       else if(sentence.charAt(len-1)=='!')
       {
           type="an exclamatory";
       }
       else
       {
           type="unknown sentence type";
       }
       System.out.print("Sentence \"" + sentence + "\" is " + type + " sentence");
       return type;
    }
    /*this method runs when the user entered the option probable season. It returns the season according to the tempertaure.
    It then returns te season.*/
    public static String probableSeason(double temp) 
    {
        String probableSeason;
        if(temp>=90&&temp<110)
        {
            probableSeason="summer";
        }
        else if(temp<90&&temp>=70)
        {
            probableSeason="spring";
        }
        else if(temp<70&&temp>=50)
        {
            probableSeason="fall";
        }
        else if(temp<50)
        {
            probableSeason="winter";
        }
        else if(temp>110&&temp<-5)
        {
            probableSeason="null";
        }
        else
        {
            probableSeason="null";
        }
        System.out.print("The probable season associated with " + temp + " Fahrenheit is " + probableSeason); 
        System.out.println();
        return probableSeason;
    }
}