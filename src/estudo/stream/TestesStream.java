package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestesStream {
	public static void main(String[] args) {

		// STREAMS
		List<Integer> lista = Arrays.asList(9, 5, 3, 4, 4, 1, 6, 7, 8, 9, 10, 2, 1, 1, 2);

		// skip
		// no seguinte exemplo, os dois primeiros elementos serão ignorados
		// lista.stream().skip(2).forEach(x -> System.out.println(x));

		// limit
		// no seguinte exemplo, apenas os 5 primeiros elementos serão considerado
		// lista.stream().limit(5).forEach(x -> System.out.println(x));

		// distinct
		// elimina repetições (equals e hashcode)
		// lista.stream().distinct().forEach(x -> System.out.println(x));

		// os tres juntos
		// a ordem importa
		// lista.stream().skip(2).distinct().limit(4).forEach(x ->
		// System.out.println(x));

		// filter
		// os elementos do fluxo de dados passarão pela condicional e só serão printados
		// os que atendem a condição
		// lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		// map
		// transforma
		// diferente do map do js
		// lista.stream().map(e -> e.equals(4) || e.equals(1)).forEach(e ->
		// System.out.println(e));

		// #Segunda parte #//

		// count
		Long count = lista.stream().count();
		System.out.println(count);

		// min e max
		Optional<Integer> min = lista.stream().min(Comparator.naturalOrder());
		Optional<Integer> max = lista.stream().max(Comparator.naturalOrder());
		System.out.println(min.get() + "\n" + max.get());

		// collect to list
		//joga tdo numa lista
		List<Integer> novaLista = lista.stream().filter(e -> e % 2 == 0).map(e -> e * 2).collect(Collectors.toList());
		System.out.println(novaLista);
		// collect groupingBy
		//agrupar em um mapa
		Map<Boolean, List<Integer>> mapa = lista.stream().collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(mapa);
		// ##//
		Map<Integer, List<Integer>> agrup = lista.stream().collect(Collectors.groupingBy(e -> e % 3));
		System.out.println(agrup);
		// collect joining
		//tudo numa String
		String collect = lista.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(" - "));
		System.out.println(collect);
	}
}
