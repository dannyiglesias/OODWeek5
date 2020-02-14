
public class Throttle implements EngineState {
	
	private static Throttle instance = new Throttle();
	
	private Throttle() {}
	
	public static Throttle instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine)
	{
		System.out.println("Throttling up to 15000RPM");	
		engine.setCurrentState(IdleBack.instance());
	}

}


