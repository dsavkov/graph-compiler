package custom;

public class Variable {

	private String name;

	private String type;

	private String module;

	public Variable(String name, String type, String module) {
		this.name = name;
		this.type = type;
		this.module = module;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("name=%s;type=%s;module=%s", name, type, module);
	}
}
