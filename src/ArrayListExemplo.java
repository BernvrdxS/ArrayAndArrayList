import java.util.ArrayList;

public class ArrayListExemplo {

	public static void display(ArrayList<String> itens, String header) {
		System.out.printf(header);
		
		for (String item : itens) {
			System.out.printf("%s ", item);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> itens = new ArrayList<String>();
		itens.add("red");
		itens.add(0, "yellow");
		
		System.out.print("Display list contents with counter-controlled loop ");
		
		for (int i = 0; i < itens.size(); i++) {
			System.out.printf("%s ", itens.get(i));
		}
		
		display(itens, "Display list contents with enhanced for statement ");
		itens.add("green");
		itens.add("yellow");
		display(itens, "List with two new elements ");
		itens.remove("yellow");
		display(itens, "Remove first instance of yellow ");
		itens.remove(1);
		display(itens, "remove second list element(green) ");
		
		System.out.printf("\"red\" is %sin the list%n", itens.contains("red") ? "" : "not" );
		
		System.out.printf("size %s%n", itens.size());
	}

}
