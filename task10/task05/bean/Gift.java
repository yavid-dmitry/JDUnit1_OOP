package by.htp.task10.task05.bean;

import java.util.ArrayList;
import java.util.List;

public class Gift {
	private String name;
	private List<Sweet> giftList;
	private Cover cover;

	public Gift(String name) {
		this.name = name;
		this.giftList = new ArrayList<Sweet>();
		this.cover = new Cover();
	}

	public Gift(String name, List<Sweet> giftList, Cover cover) {
		this.name = name;
		this.giftList = giftList;
		this.cover = cover;
	}

	public List<Sweet> getGiftList() {
		return giftList;
	}

	public void setGiftList(List<Sweet> giftList) {
		this.giftList = giftList;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((giftList == null) ? 0 : giftList.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		if (giftList == null) {
			if (other.giftList != null)
				return false;
		} else if (!giftList.equals(other.giftList))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Подарок: " + descriptGift(giftList) + " упаковка:" + cover;
	}

	private static String descriptGift(List<Sweet> giftList) {
		String Gift = new String();
		for (Sweet s : giftList) {
			Gift += s.toString() + ", ";
		}
		return Gift;

	}

}