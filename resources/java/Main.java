import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // How to declare an array in Java
    public static void declareArray() {
        int[] array = new int[10];
    }

    // String methods
    public static void stringMethods() {
        String str1 = "Welcome"; // Using literal

        String str2 = new String("Edureka"); // Using new keyword

        //: It is a mutable class that is thread-safe and synchronized.
        //StringBuilder: It is a mutable class that is not thread-safe but is faster and is used in a single threaded environment. 
        //String Methods Few of the most important and frequently used String methods are listed below:

        str1 == str2 //compares address;
        String newStr = str1.equals(str2); //compares the values
        String newStr = str1.equalsIgnoreCase() //compares the values ignoring the case
        newStr = str1.length() //calculates length
        newStr = str1.charAt(i) //extract i'th character
        newStr = str1.toUpperCase() //returns string in ALL CAPS
        newStr = str1.toLowerCase() //returns string in ALL LOWERvCASE
        newStr = str1.replace(oldVal, newVal) //search and replace
        newStr = str1.trim() //trims surrounding whitespace
        newStr = str1.contains("value"); //check for the values
        newStr = str1.toCharArray(); // convert String to character type array
        newStr = str1.IsEmpty(); //Check for empty String
        newStr = str1.endsWith(); 
    }

    public void writeToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"))) {
                bw.write("Test");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }


    public static void traverseAnArray() {
        //Add import java.util.Arrays;
        int[] itemList = new int[10];
        Arrays.asList(itemList).stream().forEach(System.out::println);
    }

    //Create an arraylist
    public static void arrayListDeclaration() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0);
        cars.set(0, "Opel");
        cars.remove(0);
        cars.size();
      }

      //Create a HashMap
        public static void hashMapDeclaration() {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("1", "Volvo");
            hashMap.put("2", "BMW");
            hashMap.put("3", "Ford");
            hashMap.put("4", "Mazda");
            System.out.println(hashMap);

            hashMap.get("1");
            hashMap.remove("1");
            hashMap.size();
            hashMap.isEmpty();

            for(String key : hashMap.keySet()) {
                System.out.println(key);
            }

            for(String value : hashMap.values()) {
                System.out.println(value);
            }

        }


        /*
         *  Problems
         */

        public static boolean hasAllUniqueChars (String word) {
            HashSet alphaSet=new HashSet();
    
            for(int index=0;index < word.length(); index ++)   {
                char c =word.charAt(index);
                // If Hashset's add method return false,that means it is already present in HashSet
                if(!alphaSet.add(c))
                     return false;
            }
            return true;
       }

       public static void findSubstrings() {
            String str="abbc";
            System.out.println("All substring of abbc are:");
            for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                    System.out.println(str.substring(i,j));
            
            }
        }
    }

}
