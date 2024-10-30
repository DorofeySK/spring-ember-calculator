package calcrestapi.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrestapi.message.Request;
import calcrestapi.message.Response;
import calcrestapi.opers.IMathOper;

@RestController
@RequestMapping(path = "/api/sum", produces = "application/json")
public class SumController {
	@PostMapping(consumes = "application/json")
	public Map<String, Object> getSum(@RequestBody Request rq) {
		IMathOper sum = (x, y) -> x.add(y); //{return x.add(y);}; - work too
		return new Response().add(
			"sum", 
			sum.result(rq.getFirst(), rq.getSecond())
		).getRs();
	}
}
