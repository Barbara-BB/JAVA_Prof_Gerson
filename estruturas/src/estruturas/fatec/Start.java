package estruturas.fatec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		//python dicionario {id:value} == java mapa <k,v>
		Map<String,String> mapinha = new HashMap<String,String>();
		mapinha.put("id1","Gerson");
		mapinha.put("id2","Thamiris");
		mapinha.put("id3","Barbara B.");
		mapinha.put("id4","Levi");
		
		System.out.println(mapinha.get("id3"));
		System.out.println(mapinha);
		//hashcode compara itens
		
		// Conjunto, uma sacola, sem ordenação,elemento duplicado não é permitido
		Set<String> conj = new HashSet();
		conj.add("Gerson");conj.add("Barbara B.");
		conj.add("Levi");conj.add("Thamiris");conj.add("Thamiris");
		for (String s : conj) {
			System.out.println(s);
		}
		//lista de veiculo
		List<Veiculo> abc = new ArrayList();
		Carro c = new Carro();
		abc.add(c);
		//estrutura array(vector)---tamanho definido, pre aloca os espaços
		String textos2[] = new String[5];
		System.out.println(textos2.length);
		// estruturas de lista---aumentável, inicia vazia
		List<String> textos = new ArrayList();
		textos.add("Gerson");textos.add("Barbara B.");textos.add("Levi");
		textos.remove(0);
		textos.add(0,"Gerson");
		Collections.sort(textos);
		for (String t : textos) {
			System.out.println(t);
		}
		//tamanho da lista
		System.out.println(textos.size());
		//textos.clear();limpa a lista
		//ver se a lista é vazia
		System.out.println(textos.isEmpty());
	}

}
