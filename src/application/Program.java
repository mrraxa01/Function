package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	
	//recebe uma lista de produtos e retorna a lista em caixa alta
	//para usar a Function tem que converter para stream e dps reconverter para list novamente
	//op��o 1 - classe implementando Function
	
	//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
	// op��o 2 - m�todo est�tico
		
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
	//op��o 3 - m�todo n�o est�tico	
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
	//op��o 4 - express�o declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	
	}
}
