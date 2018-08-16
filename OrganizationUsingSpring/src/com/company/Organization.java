package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {

	private String name;
	private Address address;
	private double marketValue;
	private String established;
	private int employeeCount;
	
	Set <String> globalPresence;
	List <String> boardMembers ;
	Map<String,String> projectManagers;
	private Properties proxies;
	


	public Organization(String name, Address address, double marketValue, String established, int employeeCount,
			Set<String> globalPresence, List<String> boardMembers, Map<String, String> projectManagers,
			Properties proxies) {
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		this.established = established;
		this.employeeCount = employeeCount;
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManagers = projectManagers;
		this.proxies = proxies;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", employeeCount=" + employeeCount + ", globalPresence=" + globalPresence
				+ ", boardMembers=" + boardMembers + ", projectManagers=" + projectManagers + ", proxies=" + proxies
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
	
	
	
	
	
}
