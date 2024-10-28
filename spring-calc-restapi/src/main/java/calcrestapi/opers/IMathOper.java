package calcrestapi.opers;

import java.math.BigDecimal;

@FunctionalInterface
public interface IMathOper {
	BigDecimal result(BigDecimal first, BigDecimal second);
}
