
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
      
        Scanner scanner =new Scanner(System.in);
        System.out.println("Cumleyi Giriniz:");
        String cumle =scanner.nextLine();
        
        Map<Character,Integer>Frekans = new TreeMap<Character,Integer>();
        
        for (int i = 0; i < cumle.length() ; i++) {
            char c = cumle.charAt(i);
            
            if (Frekans.containsKey(c)) {
                Frekans.replace(c, Frekans.get(c) + 1);
                
            }
            else{
                Frekans.put(c, 1);
            }
            
        }
        
        for(Map.Entry<Character,Integer> entry : Frekans.entrySet()){
        
            System.out.println("Karakter : " + entry.getKey() +  " " + entry.getValue() + " Kadar Geciyor...");
       
        }
        
    }
    
}
