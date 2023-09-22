
public class Product {
	
	private int id;	
	
	private String type;

	private String brand;

	private int views;

	private String name;


	private String image;

	private String source;

	private int price;


	
	private String processor;
	
	private String operating_system;

	private String graphics;
	
	private String memory;
	
	private String storage;

	private String display;
	
	private String camera;

	private boolean isSaved;
	

	public Product() {
		super();	
		}

	





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public String getGraphics() {
		return graphics;
	}
	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	

	public boolean getIsSaved() {
		return isSaved;
	}


	public void setIsSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}







	@Override
	public String toString() {
		return "Product [id=" + id + ", type=" + type + ", brand=" + brand + ", views=" + views + ", name=" + name
				+ ", image=" + image + ", source=" + source + ", price=" + price + ", processor=" + processor
				+ ", operating_system=" + operating_system + ", graphics=" + graphics + ", memory=" + memory
				+ ", storage=" + storage + ", display=" + display + ", camera=" + camera + ", isSaved=" + isSaved + "]";
	}







	public Product(int id, String type, String brand, int views, String name, String image, String source, int price,
			String processor, String operating_system, String graphics, String memory, String storage, String display,
			String camera, boolean isSaved) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.views = views;
		this.name = name;
		this.image = image;
		this.source = source;
		this.price = price;
		this.processor = processor;
		this.operating_system = operating_system;
		this.graphics = graphics;
		this.memory = memory;
		this.storage = storage;
		this.display = display;
		this.camera = camera;
		this.isSaved = isSaved;
	}


	

}
