package default_package;
import java.util.Calendar;

public class ClasseCalender{
	public static void main (String[]args) {
	//Recuperação da data com a classe Calendar
	
	System.out.println("==> Recuperação da data com a classe Calender");
	Calendar cal = Calendar.getInstance();
	System.out.println("Data e Hora Atual: " + cal.getTime() + "\n");

	}
}