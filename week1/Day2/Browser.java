package week1.Day2;

public class Browser {
	
	public String launchBrowser(String browserName) 
	{
	
	System.out.println(browserName + "Browser launched successfully");
	return browserName;
	
	}	
	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
		
	}
	public static void main(String[] args) {	
		Browser Brow = new Browser();
		String launch = Brow.launchBrowser("Google Chrome");
		System.out.println(launch);
		Brow.loadUrl();
	}

}
