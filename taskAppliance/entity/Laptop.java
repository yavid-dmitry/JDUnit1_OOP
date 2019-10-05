package by.htp.taskAppliance.entity;

public class Laptop extends Appliance{

	private double battery;
	private String os;
	private int systemMemory;
	private double cpu;
	private int displayInchs;
	public Laptop(double battery, String os, int systemMemory, double cpu, int displayInchs) {
		super();
		this.battery = battery;
		this.os = os;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(battery);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + displayInchs;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + systemMemory;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(battery) != Double.doubleToLongBits(other.battery))
			return false;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Notebook" + battery + ", os=" + os + ", systemMemory=" + systemMemory + ", cpu=" + cpu
				+ ", displayInchs=" + displayInchs;
	}

	
}