import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner; 

public class main { 

    public static void main(String[] args) throws IOException  { 
        
        String str = String.join("\n"
        , "It was the best of times, it was the worst of times,"
        , "it was the age of wisdom, it was the age of foolishness,"
        , "it was the epoch of belief, it was the epoch of incredulity,"
        , "it was the season of Light, it was the season of Darkness,"
        , "it was the spring of hope, it was the winter of despair,"
        , "we had everything before us, we had nothing before us"
);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter text location for word frequency analysis: ");

        String textFile = myObj.nextLine();  // Read user input
        Path fileName = Path.of(textFile);
        String content  = "hello world !!";
        Files.writeString(fileName, content);
        
        str = Files.readString(fileName);
        int i, j, dropout, len; 
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str = str.replaceAll(",", "");
        len = str.length();
        int[] freq = new int[len];

        //Converts given string into character array  
        char gg[] = str.toCharArray(); 

        for(i = 0; i <str.length(); i++) {
            if (gg[i] > 64 && gg[i] < 91){
                
            } 
        } 

        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if( gg[i] ==  gg[j]) {  
                    freq[i]++;  
    
                    //Set string[j] to 0 to avoid printing visited character  
                    gg[j] = '0';  
                }  
            }  
        }  

        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");
        dropout = 0;  
        for(i = 0; i < len; i++) {  
            if( gg[i] != ' ' &&  gg[i] != '0'){  
                gg[i-dropout] = gg[i];
                freq[i-dropout] = freq[i];
            } else {
                dropout++;
            }  
        }
        
        FrequencyList wordFrequency = new FrequencyList();
        wordFrequency.addValues(gg, freq);
        wordFrequency.printValues();
    }  
} 
