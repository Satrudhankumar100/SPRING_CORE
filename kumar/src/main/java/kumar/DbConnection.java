package kumar;

public class DbConnection {

	private String driver;
	private String url;

	public DbConnection() {
		super();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Test [driver=" + driver + ", url=" + url + "]";
	}
	

}
