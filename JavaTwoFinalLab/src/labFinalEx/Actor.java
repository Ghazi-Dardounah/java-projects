package labFinalEx;

public class Actor {
	private String name;
	private String agentID;
	public Actor(String name, String agentID) {
		this.name = name;
		this.agentID = agentID;
	}
	public String getName() {
		return name;
	}
	public String getAgentID() {
		return agentID;
	}
	public boolean equals(Actor other) {
		if(this.getAgentID().equals(other.getAgentID())) {
			return true;
		}
		return false;
	}
	public String toString() {
		return name+" ["+agentID+"]";
	}
	

}
