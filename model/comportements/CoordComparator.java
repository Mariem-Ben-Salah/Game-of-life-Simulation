package model.comportements;

import java.util.Comparator;
import model.agents.Agent;

public class CoordComparator implements Comparator<Agent> {

	@Override
	public int compare(Agent arg0, Agent arg1) {
		int ret = 1;
		//Integer.compare(x,y) returns -1 if x<y,0 if =, 1 otherwise
		if (arg0.getCoord().x == arg1.getCoord().x)
		{
			if (arg0.getCoord().y < arg1.getCoord().y)
				ret = -1;	
		}
		else if (arg0.getCoord().x < arg1.getCoord().x) {
			ret = -1;	
		}
	return ret;
	}
}

