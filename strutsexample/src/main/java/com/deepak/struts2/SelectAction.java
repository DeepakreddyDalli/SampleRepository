/**
 * 
 */
package com.deepak.struts2;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author deepu
 *
 */
public class SelectAction extends ActionSupport {
	private static final long serialVersionUID = -3491506254002931952L;
	private List<Flavor> flavors = new ArrayList<>();
	private String flavor;

	public String execute() {
		Flavor f1 = new Flavor();
		Flavor f2 = new Flavor();
		Flavor f3 = new Flavor();

		flavors = new ArrayList<>();

		f1.setName("Vanilla");
		f1.setId(1);

		f2.setName("Chocolate");
		f2.setId(2);

		f3.setName("Strawberry");
		f3.setId(3);

		flavors.add(f1);
		flavors.add(f2);
		flavors.add(f3);

		System.out.println("Flavor list size : " + flavors.size());
		return ActionSupport.SUCCESS;
	}

	public List<Flavor> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<Flavor> flavors) {
		this.flavors = flavors;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	
}
