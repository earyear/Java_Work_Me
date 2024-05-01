package ex_240426;


public class BookTest {

	public static void main(String[] args) {
//		
//		Book bookarray[] = new Book[3];
//		
//		bookarray[0]= new Book("정의란 무엇인가","마이클샌델",25000);
//		bookarray[1]= new Book("명품자바","황기태",35000);
//		bookarray[2]= new Book("내책","남귀연",100000);
//		
		Book b1 = new Book("정의란 무엇인가","마이클샌델",25000);
		Book b2 = new Book("명품자바","황기태",35000);
		Book b3 = new Book("내책","남귀연",100000);
		
		Book bookarray[] = new Book[3];
		
		bookarray[0] = b1;
		bookarray[1] = b2;
		bookarray[2] = b3;
		
		
		for(int i=0; i<bookarray.length; i++) {
			bookarray[i].showinfo();
		}
		
	}

}
