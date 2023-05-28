import java.lang.System.*;

public class Main {
	static boolean game = true;
	static long lastTime = System.currentTimeMillis();
	static long currentTime = System.currentTimeMillis();
	static long time=0;
	static long i;
	
    public static void main(String[] args) {
		
		while(game){
			time=16-(currentTime-lastTime);
			
			try
			{
				if(time>0){
					Thread.sleep(time);
				}
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			//***********************************************
			/*
			
			Put all Game parts here!!!!!!
			*/
			//***********************************************
			lastTime = currentTime;
			currentTime = System.currentTimeMillis();
		}
	}
  }
  