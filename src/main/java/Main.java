import com.cobra.ldtp.Ldtp;

/**
 * ###################################################################################
 * 
 * @Filename : Main.java
 * @Author : Vaijnath @time 11:29:08 AM
 * @Purpose : TODO
 * @CreationDate : Jan 24, 2019
 * @Package :
 *          ###################################################################################
 **/

/**
 * ###################################################################################
 * 
 * @Name : Main
 * @Author : Vaijnath
 * @Purpose : TODO
 * @CreationDate : Jan 24, 2019 11:29:08 AM
 * @Package :
 *          ###################################################################################
 **/
public class Main {
	
	/**
	 * ###################################################################################
	 * 
	 * @Name : main
	 * @Purpose : TODO
	 * @Parameters : @param args
	 * @ReturnType : void
	 * @Author : Vaijnath
	 * @CreationDate : Jan 24, 2019 11:29:08 AM
	 * @Modification :
	 *               ###################################################################################
	 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ldtp ldtp = new Ldtp("*Notepad");
		ldtp.activateWindow("*Notepad");
		//		ldtp.maximizeWindow();
		System.out.println(String.join(", ", ldtp.getWindowList()));
		//		System.out.println(ldtp.activateWindow("*Notepad"));
	}
	
}
