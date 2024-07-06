package edu.designer_pattern_java.testFactory;

import edu.designer_pattern_java.factory.ComputadorFactory;
import edu.designer_pattern_java.model.Computador;

public class TestFactory {

	public static void main(String[] args) {
		Computador pc = ComputadorFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computador server = ComputadorFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory Method na configuração do PC ::"+pc);
		System.out.println("Factory Server na configuração do Servidor::"+server);
	}

}
