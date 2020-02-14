
public class IdleBack implements EngineState {
	
	private static IdleBack instance = new IdleBack();
	
	private IdleBack() {}
	
	public static IdleBack instance() {
		return instance;
	}
	
	public void updateEngineState(EngineContext engine)
	{
		System.out.println("Engine has returned to idle");	
		engine.setCurrentState(Shutdown.instance());
	}

}


