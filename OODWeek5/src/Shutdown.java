
public class Shutdown implements EngineState {
	
	private static Shutdown instance = new Shutdown();
	
	private Shutdown() {}
	
	public static Shutdown instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine)
	{
		System.out.println("Engine will now shutdown");		
	}

}

	
	
	
	
