
public class EngineContext {
	
	private EngineState currentState;
	private String stateId;
	
	public EngineContext(EngineState currentState, String stateId)
	{
		super();
		this.currentState = currentState;
		this.stateId = stateId;
		
		if(currentState == null) {
			this.currentState = Ignite.instance();
		}
	}
	
	public EngineState getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(EngineState currentState) {
		this.currentState = currentState;
	}
	
	public String getStateId() {
		return stateId;
	}
	
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	
	public void update() {
		currentState.updateEngineState(this);
	}

}
