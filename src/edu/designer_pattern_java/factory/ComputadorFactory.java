package edu.designer_pattern_java.factory;

import edu.designer_pattern_java.model.Computador;
import edu.designer_pattern_java.model.PC;
import edu.designer_pattern_java.model.Server;

public class ComputadorFactory {

	public static Computador getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}
