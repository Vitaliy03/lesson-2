import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws MyArraySizeException, MyArrayDataException{
	    Scanner scanner = new Scanner(System.in);
	    
		String a [][]= new String [4][4];
		for (int i = 0; i < 4; i++) {  
                for (int j = 0; j < 4; j++) {
                    if (i == j){
                        a[i][j] = "3";
                    }
                    else {
                        a[i][j] = "Язык";
                    }
                    }
		    }
		arrays(a);
	}
	public static void arrays(String[][] b) throws MyArraySizeException, MyArrayDataException{
	    try{
	        int c = b.length;
	        int d = b[0].length;
	        if(c != 4 & d !=4) throw new MyArraySizeException();
	        int [][] b1 = new int [4][4];
	        for (int i = 0; i < 4; i++) {  
                for (int j = 0; j < 4; j++) {
                    b1[i][j] = Integer.parseInt(b[i][j]); throw new MyArrayDataException();
                }
	        }
	        int summ = 0;
	        for (int i = 0; i < 4; i++) {  
                for (int j = 0; j < 4; j++) {
                    summ += b1 [i][j];
                }
	        }
	        System.out.println (summ);
	    }
	    catch (MyArraySizeException error){
	        System.out.println(error.getMessage());
}
        catch (MyArrayDataException error){
            System.out.println(error.getMessage());
        }
}
}
class MyArraySizeException extends Exception{
    MyArraySizeException(){
        super (String.format("Массив неправильной длины"));
    }
}
class MyArrayDataException extends Exception{
    MyArrayDataException(){
        super (String.format("Неверные данные в ячейке"));
    }
}
		
	


