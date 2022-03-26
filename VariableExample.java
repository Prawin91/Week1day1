package week1.day1;

public class VariableExample {

		String Model = "Realme123" ;
		float Weight = 1.5f;
		boolean Charged = true;
		int cost = 10000;
	
		public void Model()  {
			System.out.println(Model);
		}
		
		public void Weight() {
			System.out.println(Weight);
		}
		
		public void Charged() {
			System.out.println(Charged);
		}
		
		public void cost() {
			System.out.println(cost);
		}
		
		public static void main(String[] args) {
		
		VariableExample ref = new VariableExample();
		
		System.out.println(ref.Charged);
		System.out.println(ref.cost);	
		System.out.println(ref.Model);
		System.out.println(ref.Weight);	
	}
}
