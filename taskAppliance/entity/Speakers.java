package by.htp.taskAppliance.entity;

public class Speakers extends Appliance{

	private int power;
	private int numberOfSpeakers;
	private String freakencyRange;
	private int cordLength;
	public Speakers(String name, int power, int numberOfSpeakers, String freakencyRange, int cordLength) {
		super(name);
		this.power = power;
		this.numberOfSpeakers = numberOfSpeakers;
		this.freakencyRange = freakencyRange;
		this.cordLength = cordLength;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}
	public String getFreakencyRange() {
		return freakencyRange;
	}
	public void setFreakencyRange(String freakencyRange) {
		this.freakencyRange = freakencyRange;
	}
	public int getCordLength() {
		return cordLength;
	}
	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLength;
		result = prime * result + ((freakencyRange == null) ? 0 : freakencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
		result = prime * result + power;
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
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (freakencyRange == null) {
			if (other.freakencyRange != null)
				return false;
		} else if (!freakencyRange.equals(other.freakencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (power != other.power)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getName() + " Speakers [power=" + power + ", numberOfSpeakers=" + numberOfSpeakers + ", freakencyRange="
				+ freakencyRange + ", cordLength=" + cordLength + "]";
	}

	
	
	
}
