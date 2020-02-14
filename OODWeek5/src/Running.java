
public class Running implements EngineState {

	private static Running instance = new Running();
	
	private Running() {}
	
	public static Running instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine)
	{
		System.out.println("Engine is now running");
		engine.setCurrentState(Idle.instance());
	}

}
