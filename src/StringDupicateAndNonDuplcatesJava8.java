import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDupicateAndNonDuplcatesJava8 {

	public static void main(String[] args) {
		String str = "abbcdfab";

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character ch : str.toCharArray()) {
			hm.put(ch, hm.containsKey(ch)?hm.get(ch)+1:1);
		}

		hm.entrySet().stream().filter(e->e.getValue()==1).forEach(e->System.out.print(e));
	}

}
