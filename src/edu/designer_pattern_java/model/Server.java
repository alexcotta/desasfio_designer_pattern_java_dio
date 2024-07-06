package edu.designer_pattern_java.model;

public class Server extends Computador {

	private String memoriaRam;
	private String hdd;
	private String cpu;
	
	public Server(String memoriaRam, String hdd, String cpu){
		this.memoriaRam=memoriaRam;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getMemoriaRAM() {
		return this.memoriaRam;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}