package cases;

import java.util.Arrays;
import java.util.List;

public class CaseInsensitive {
	public static void main(String[] args) {
		String[] nomes = { "Augusto", "luís", "Sabrina", "Carlos" };

		List<String>lista=Arrays.asList(nomes);
		lista.stream().map(obj->obj.toLowerCase()).filter(obj->obj.contains("s")).forEach(e->System.out.println(e));
		
	}
}
