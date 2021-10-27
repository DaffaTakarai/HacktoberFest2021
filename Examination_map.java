import java.util.*;  
import java.io.*;     

class Examination_map {

    public static void main(String [] args) throws Exception {
      
        /* Read input and save as entries in  HashMap */                  

        Scanner in = new Scanner(System.in);
                System.out.print("Enter no of candidates: ");
                int n = in.nextInt();   // Get the number of entries

        HashMap<Integer, String> map = new HashMap<>();    // Create the hashMap
       
        System.out.println("\n Input Entries to the List \n");

            for (int i = n-1; i >= 0;  i -= 1) {   // Loop to compare no of candidates and 1, then decreases no of candidates by 1
               
                               
                                                               
                Scanner logp = new Scanner(System.in);          // Get index numbers as variable name'id' to add to hashMap
                    System.out.println("Index Number: ");      
                    int id = logp.nextInt(); 
                    
                    Scanner logn = new Scanner(System.in);         // Get names as variable name'name' to add to hashMap
                    System.out.println("Name: ");    
                    String name = logn.next();
                
                map.put(id, name);   // put each name and id to the map (key-id, value-name) 
            }
   
        System.out.println("\n\tCandidate List\n");
        System.out.println("\tIndex No.    |    Name");
        System.out.println("--------------------------------");

       
        for (Map.Entry<Integer, String> entry : map.entrySet())                       // Iterating over the hashMap's entry set using for loop
                System.out.println("\t"+entry.getKey() + "\t|\t" + entry.getValue()); // print each key-value pairs

                System.out.println("\n--------------------------------\n");

                System.out.println("\nEnter the index number to get the name");
                Scanner nw = new Scanner(System.in);    // Get a key element to find the relevent value
                Integer d;
                   // parameter to assign above key element (id2)
        
        
        /* Read each query and check if its in the HashMap */
        while((d = nw.nextInt()) != null) {    
          
            if (map.containsKey(d)) {        // Check whether the particular key value 's' is being mapped into the hashMap
                System.out.println("\n"+d+" Index No 's name: "+(map.get(d)));     // Get the relevent value 
            } 
            else {
                System.out.println("Not found");
            }
        }
       
    }
}