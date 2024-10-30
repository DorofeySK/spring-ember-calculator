package calcrestapi.message;

import java.util.HashMap;
import java.util.Map;

public class Response {
	Map<String, Object> rs;
	public Response() {
		rs = new HashMap<>();
	}
	
	public Response add(String key, Object value) {
		rs.put(key, value);
		return this;
	}
	
	public Map<String, Object> getRs() {
		return rs;
	}
}
