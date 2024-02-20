import java.util.*;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args) {
	    List<String> names = new ArrayList<>();
	    names.add("Carlos");
	    names.add("María");
	    names.add("Rassmusen");
	    names.add("Pedro");
	    names.add("Seferino");

	    
	    //Create an array of the number of characters of each names
	    
	    List<Integer> nameLengthChars = names.stream().map(el -> el.length())
	                    .collect(Collectors.toList());
	                    
	    List <String> fiveCharsNames = names.stream()
	                    .filter(el -> el.length() <= 5)
	                    .collect(Collectors.toList());

	    fiveCharsNames.forEach(el -> System.out.println(el));
	}
}
