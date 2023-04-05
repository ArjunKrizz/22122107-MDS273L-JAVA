import java.util.*;
import java.io.*;
public class Lab6 {
    static void vow(String txt){
        String a=txt.toLowerCase();
        char[] vowel={'a','e','i','o','u'};
        int[] arr=new int[vowel.length];
        for(int i=0;i<a.length();i++){
            switch(a.charAt(i)){
                case 'a':
                arr[0]++;
                break;
                case 'e':
                arr[1]++;
                break;
                case 'i':
                arr[2]++;
                break;
                case 'o':
                arr[3]++;
                break;
                case 'u':
                arr[4]++;
                break;
            }
            
        }
        for(int j=0;j<vowel.length;j++){
            System.out.print("["+vowel[j]+" : "+arr[j]+"],");
        }
    }//
    static void Numcount(String txt){
        char[] num={'0','1','2','3','4','5','6','7','8','9'};
        int[] arr=new int[num.length];
        for(int i=0;i<txt.length();i++){
            switch(txt.charAt(i)){
                case '0':
                arr[0]++;
                break;
                case '1':
                arr[1]++;
                break;
                case '2':
                arr[2]++;
                break;
                case '3':
                arr[3]++;
                break;
                case '4':
                arr[4]++;
                break;
                case '5':
                arr[5]++;
                break;
                case '6':
                arr[6]++;
                break;
                case '7':
                arr[7]++;
                break;
                case '8':
                arr[8]++;
                break;
                case '9':
                arr[9]++;
                break;
            }   
        }
        for(int j=0;j<num.length;j++){
            System.out.print("["+num[j]+" : "+arr[j]+"],");
        }
        
    }//
    public static void top_5W(String txt) {
        String[] words = txt.toLowerCase().split("\\s+");
    
        String[] topWords = new String[5];
        int[] wordCounts = new int[5];
    
        for (String word : words) {
            int count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) {
                    count++;
                }
            }
            for (int i = 0; i < topWords.length; i++) {
                if (count > wordCounts[i]) {
                    for (int j = topWords.length - 2; j >= i; j--) {
                        topWords[j + 1] = topWords[j];
                        wordCounts[j + 1] = wordCounts[j];
                    }
                    topWords[i] = word;
                    wordCounts[i] = count;
                    for (int k = i + 1; k < topWords.length; k++) {
                        if (topWords[k] != null && topWords[k].equals(word)) {
                            wordCounts[k] = count;
                        }
                    }
                    break;
                } else if (count == wordCounts[i] && word.equals(topWords[i])) {
                    break;
                }
            }
        }
    
        for (int i = 0; i < topWords.length; i++) {
            System.out.print("[" + topWords[i] + " : " + wordCounts[i] + "], ");
        }
    }//
    static void least_5W(String text) {
        String a = text.toLowerCase();
        String[] words=a.split(" ");
        String[] leastWords = new String[5];
        int[] wordCounts = new int[5];
        Arrays.fill(wordCounts, Integer.MAX_VALUE);
    
        for (String word : words) {
            int count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) {
                    count++;
                }
            }
    
            for (int i = 0; i < leastWords.length; i++) {
                if (count < wordCounts[i]) {
                    for (int j = leastWords.length - 2; j >= i; j--) {
                        leastWords[j + 1] = leastWords[j];
                        wordCounts[j + 1] = wordCounts[j];
                    }
                    leastWords[i] = word;
                    wordCounts[i] = count;
                    break;
                }
            }
        }
    
        System.out.println("Least 5 frequent words:");
        for (int i = 0; i < leastWords.length; i++) {
            System.out.print("[" + leastWords[i] + " : " + wordCounts[i] + "], ");
        }
    }//
    static void top5Chars(String txt) {
        String a = txt.replaceAll("\\s", "");
        String b=a.toLowerCase();
        char[] chars = b.toCharArray(); 
        char[] topChars = new char[5];
        int[] charCounts = new int[5];
        int numDistinctChars = 0;
        for (char ch : chars) {
            int count = 0;
            for (char ch2 : chars) {
                if (ch == ch2) {
                    count++;
                }
            }
            boolean inserted = false;
            for (int i = 0; i < topChars.length; i++) {
                if (count > charCounts[i]) {
                    for (int j = topChars.length - 2; j >= i; j--) {
                        topChars[j + 1] = topChars[j];
                        charCounts[j + 1] = charCounts[j];
                    }
                    topChars[i] = ch;
                    charCounts[i] = count;
                    inserted = true;
                    break;
                } else if (ch == topChars[i]) {
                    charCounts[i] = count;
                    inserted = true;
                    break;
                }
            }
            if (!inserted && numDistinctChars < topChars.length) {
                topChars[numDistinctChars] = ch;
                charCounts[numDistinctChars] = count;
                numDistinctChars++;
            }
        }
        System.out.println("Top 5 characters:");
        for (int i = 0; i < numDistinctChars; i++) {
            System.out.print("[" + topChars[i] + " : " + charCounts[i] + "], ");
        }
    }//
    static void least5Chars(String txt) {
        String a = txt.replaceAll("\\s", "");
        String b=a.toLowerCase();
        char[] chars = b.toCharArray();
        char[] leastChars = new char[5];
        int[] charCounts = new int[5];
        Arrays.fill(charCounts, Integer.MAX_VALUE); 
        
        for (char ch : chars) {
            int count = 0;
            for (char ch2 : chars) {
                if (ch == ch2) {
                    count++;
                }
            }
            for (int i = 0; i < leastChars.length; i++) {
                if (count < charCounts[i]) {
                    for (int j = leastChars.length - 2; j >= i; j--) {
                        leastChars[j + 1] = leastChars[j];
                        charCounts[j + 1] = charCounts[j];
                    }
                    leastChars[i] = ch;
                    charCounts[i] = count;
                    break;
                }
            }
        }
        
        // Print out the least 5 characters and their counts
        System.out.println("Least 5 characters:");
        for (int i = 0; i < leastChars.length; i++) {
            System.out.print("[" + leastChars[i] + " : " + charCounts[i] + "], ");
            }

        }
    
    public static void main(String[] args){
        
        
        String txt ="";
        try{
            File file=new File("D:/Research Related/text.txt");
            Scanner sc=new Scanner(file);

            while(sc.hasNextLine()){
             String txt1=sc.nextLine();
             String txt2=txt1.replace(".","");
             String txt3=txt2.replace("'", "");
             String txt4=txt3.replace(",", "");
             String txt5=txt4.replace("(", "");
             String txt6=txt5.replace(")", "");
             String txt7=txt6.replace("%", "");
             txt+=txt7;          
            }
        }catch(Exception e){
            System.out.println((e.getMessage()));
        }
        System.out.println("Vowles :");
        vow(txt);
        System.out.println("number counts");
        Numcount(txt);
        System.out.println();
        top_5W(txt);
        System.out.println();
        least_5W(txt);
        System.out.println();
        top5Chars(txt);
        System.out.println();
        least5Chars(txt);
        }      
    }