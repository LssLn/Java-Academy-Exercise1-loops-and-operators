
public class test2 {
	public static int for_1() {
		int somma=0;
		/*Scrivere un programma che fa la somma degli interi da 0 a 30 divisibili per 3*/
		for(int i=0; i<=30;i++) {
			if(i%3 == 0) {
				System.out.println(i+"è ok\n");
				somma=somma+i;
			}
		}
		return somma;
	}
	
	
	public static int while_1() {

		int i=0;
		int somma=0;
		while(i<=30) {
			if(i%3==0) {
				somma=somma+i;
				
			}
			i++;
		}
		return somma;
	}
	
	public static int dowhile_1() {

		int i=0;
		int somma=0;
		do {
			if(i%3==0) {
				somma=somma+i;
				
			}
			i++;
		}while(i<=30);
		
		return somma;
	}
	
	public static void main(String[] args) {
		
		int return1 = for_1();
		System.out.println("ciclofor: "+return1);
		int return2 = while_1(); 
		System.out.println("ciclowhile: "+return2);
		int return3 = dowhile_1(); 
		System.out.println("ciclodowhile "+return3);
	}
}
