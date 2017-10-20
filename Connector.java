package com.jdi.connect;

import java.util.Map;
import java.util.List; 
import java.io.Serializable; 

public interface Connector {
	String name();
	String description();
	Transport transport();
	Map<String,Connector.Argument> defaultArguments(); 
	
	public interface Argument extends Serializable {
		String name();
		String label();
		String description();
		String value();
		void setValue(String Value);
		boolean isValid(String value);
		boolean mustSpecify();
		
	}
	
	public interface BooleanArgument extends Argument{
		void setValue(boolean value);
		boolean isValid(String value);
		String stringValueOf(boolean value);
		boolean booleanValue();
		
	}
	
	public interface IntegerArgument extends Argument{
		void setValue(int value);
		boolean isValid(String value);
		boolean isValid(int value);
		String stringValueOf(int value);
		int intValue();
		int max();
		int min();
		
	}
	
	public interface StringArgument extends Argument{
		boolean isValid(String value);
		
	}
	public interface SelectedArgument extends Argument{
		List<String> choices();
		boolean isValid(String value);
	}
}
