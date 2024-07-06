package edu.designer_pattern_java.model;

public abstract class Computador {
	
	public abstract String getMemoriaRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getMemoriaRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
