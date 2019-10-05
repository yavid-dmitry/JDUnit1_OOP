package by.htp.task10.task01;

public class File {
	private String name;
	
	private Folder targetFolder;

	public File(String name, Folder folder) {
		this.name = name;
		targetFolder = folder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Folder getTargetFolder() {
		return targetFolder;
	}

	public void setTargetFolder(Folder targetFolder) {
		this.targetFolder = targetFolder;
	}
	
}
