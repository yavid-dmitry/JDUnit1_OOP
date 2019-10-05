package by.htp.task10.task01;

public class TextFile extends File{
	private String data;
	public TextFile(String name, Folder folder) {
		super(name, folder);
		// TODO Auto-generated constructor stub
	}
	
	public TextFile(String name, Folder folder, String data) {
		super(name, folder);
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data;
	}
	
	
	
	
}
