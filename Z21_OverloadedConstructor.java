
public class Z21_OverloadedConstructor {

	public static void main(String[] args) {
		
		//Overloaded constructor =   multiple constructor within a class with same name,
		//                           but have different parameters
		//                           name + parameters = signature
		Pizza pizza = new Pizza("thicc crust");
		System.out.println(pizza.bread);
		
		
	}

}
