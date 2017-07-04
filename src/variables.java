
public class variables {
	public static void main(String[] args) {
		//----------------Instance Variable--------------------//
	    System.out.println("Instance Variable ");
		Section sec1=new Section("section green");  // new object sec1 created and name is given as section green
		System.out.println(sec1.name);
		sec1.name="section blue";   //object sec1 name is  changed as section blue
		System.out.println(sec1.name); // doesn't give a error as it is instance variable (can be changed)
		System.out.println("\n");
		
		
	//----------------Class Variable--------------------//
		System.out.println("Class Variable");
		Product prod1 = new Product();
        prod1.setBarcode(123456);    // sets barcode as 123456 for prod1
        Product prod2 = new Product();
        prod2.setBarcode(987654);  // sets barcode as 987654 for prod1 changes the barcode in line 10 as 987654

        System.out.println(prod1.getBarcode());
        System.out.println(prod2.getBarcode());
		
	}

}
//Instance Variable
class Section{ 
String name;
public Section(String nameofsection) {  // Construcor
	name=nameofsection;
}
	
}

//Class variable
class Product {

    static int Barcode;

    int getBarcode() {
        return Barcode;
    }

    void setBarcode(int value){
        Barcode = value;
    }
}
