package by.htp.taskAppliance.entity;

public class TabletPC extends Appliance{
	private int battery;
	private int displayInches;
	private int memoryROM;
	private int flashMemory;
	private String color;
	public TabletPC(String name, int battery, int displayInches, int memoryROM, int flashMemory, String color) {
		super(name);
		this.battery = battery;
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
		this.flashMemory = flashMemory;
		this.color = color;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}
	public int getMemoryROM() {
		return memoryROM;
	}
	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}
	public int getFlashMemory() {
		return flashMemory;
	}
	public void setFlashMemory(int flashMemory) {
		this.flashMemory = flashMemory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + battery;
		result = prime * result + displayInches;
		result = prime * result + flashMemory;
		result = prime * result + memoryROM;
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
		TabletPC other = (TabletPC) obj;
		if (battery != other.battery)
			return false;
		if (color != other.color)
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemory != other.flashMemory)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getName() + " TabletPC [battery=" + battery + ", displayInches=" + displayInches + ", memoryROM=" + memoryROM
				+ ", flashMemory=" + flashMemory + ", color=" + color + "]";
	}
	
}
