package by.htp.taskAppliance.entity;

public class VacuumCleaner extends Appliance{
	private int power;
	private String bagType;
	private String filterType;
	private String wandType;
	private int regulationMotorSpeed;
	private int cleaningWidth;
	public VacuumCleaner(String name, int power, String bagType, String filterType, String wandType, int regulationMotorSpeed,
			int cleaningWidth) {
		super(name);
		this.power = power;
		this.bagType = bagType;
		this.filterType = filterType;
		this.wandType = wandType;
		this.regulationMotorSpeed = regulationMotorSpeed;
		this.cleaningWidth = cleaningWidth;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	public String getWandType() {
		return wandType;
	}
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}
	public int isRegulationMotorSpeed() {
		return regulationMotorSpeed;
	}
	public void setRegulationMotorSpeed(int regulationMotorSpeed) {
		this.regulationMotorSpeed = regulationMotorSpeed;
	}
	public int getCleaningWidth() {
		return cleaningWidth;
	}
	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + power;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (power != other.power)
			return false;
		if (regulationMotorSpeed != other.regulationMotorSpeed)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getName() + "VacuumCleaner [power=" + power + ", bagType=" + bagType + ", filterType=" + filterType + ", wandType="
				+ wandType + ", regulationMotorSpeed=" + regulationMotorSpeed + ", cleaningWidth=" + cleaningWidth
				+ "]";
	}
	
}
