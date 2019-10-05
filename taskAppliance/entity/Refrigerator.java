package by.htp.taskAppliance.entity;

public class Refrigerator extends Appliance{
	private int power;
	private int weight;
	private int classPowerConsumption;
	private int overallCapacity;
	private int height;
	private int width;
	public Refrigerator(String name, int power, int weight, int classPowerConsumption, int overallCapacity, int height, int width) {
		super(name);
		this.power = power;
		this.weight = weight;
		this.classPowerConsumption = classPowerConsumption;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getClassPowerConsumption() {
		return classPowerConsumption;
	}
	public void setClassPowerConsumption(int classPowerConsumption) {
		this.classPowerConsumption = classPowerConsumption;
	}
	public int getOverallCapacity() {
		return overallCapacity;
	}
	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + classPowerConsumption;
		result = prime * result + height;
		result = prime * result + overallCapacity;
		result = prime * result + power;
		result = prime * result + weight;
		result = prime * result + width;
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
		Refrigerator other = (Refrigerator) obj;
		if (classPowerConsumption != other.classPowerConsumption)
			return false;
		if (height != other.height)
			return false;
		if (overallCapacity != other.overallCapacity)
			return false;
		if (power != other.power)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getName() + "Refrigerator [power=" + power + ", weight=" + weight + ", classPowerConsumption="
				+ classPowerConsumption + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width="
				+ width + "]";
	}
	 
}
