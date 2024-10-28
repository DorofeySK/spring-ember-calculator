package calcrestapi.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrestapi.opers.IMathOper;
import calcrestapi.rq.Request;

@RestController
@RequestMapping(path = "/api/sum", produces = "application/json")
public class SumController {
	@PostMapping(consumes = "application/json")
	public BigDecimal getSum(@RequestBody Request rq) {
		IMathOper sum = (x, y) -> x.add(y); //{return x.add(y);}; - work too
		return sum.result(rq.getFirst(), rq.getSecond());
	}
}
