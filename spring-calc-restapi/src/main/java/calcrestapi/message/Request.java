package calcrestapi.message;

import java.math.BigDecimal;

public class Request {
	private BigDecimal first;
	private BigDecimal second;
	
	public void setFirst(BigDecimal first) {
		this.first = first;
	}
	
	public void setSecond(BigDecimal second) {
		this.second = second;
	}
	
	public BigDecimal getFirst() {
		return first;
	}
	
	public BigDecimal getSecond() {
		return second;
	}
}
