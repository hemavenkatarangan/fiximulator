package edu.harvard.fas.zfeledy.fiximulator.core;

import quickfix.StringField;

public class CustomField extends StringField {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int FIELD = 22222;
	 
	public CustomField()
	{
		super(FIELD);
	}
	 public CustomField(String data)
	 {
		 super(FIELD,data);
	 }

}
