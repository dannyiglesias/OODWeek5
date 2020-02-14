
public class Idle implements EngineState {
	
	static Idle instance = new Idle();
	
	private Idle() {}
	
	public static Idle instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine)
	{
		System.out.println("Engine is now idling");	
		engine.setCurrentState(Throttle.instance());
	}

}
