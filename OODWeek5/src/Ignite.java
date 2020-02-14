
public class Ignite implements EngineState {
	
	private static Ignite instance = new Ignite();
	
	private Ignite() {}
	
	public static Ignite instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine) {
		System.out.println("Engine has been ignited");
		engine.setCurrentState(Running.instance());
	}

}
