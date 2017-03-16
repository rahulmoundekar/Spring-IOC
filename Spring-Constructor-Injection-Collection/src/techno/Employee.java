package techno;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List adlist;
	private Set cityset;
	private Map countrymap;
	
	public Employee(List adlist,Set cityset,Map countrymap)
	{
		this.adlist=adlist;
		this.cityset=cityset;
		this.countrymap=countrymap;
	}

	@Override
	public String toString() 
	{	
		return adlist+" "+cityset+" "+countrymap ;
	}
}
