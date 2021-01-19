/**
 * 
 */
package com.springAOP.springaopzzzaroundhandleexception;

/**
 * @author Thara
 *@creation date & time: 8 Dec 2020 1:31:53 am
 */
public class Account {

	public String name;
	public String level;
	
	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param level
	 */
	public Account(String name, String level) {
		this.name = name;
		this.level = level;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + "]";
	}
}
