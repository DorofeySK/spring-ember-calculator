package calcrestapi.controllers;

import java.math.RoundingMode;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrestapi.message.Request;
import calcrestapi.message.Response;
import calcrestapi.opers.IMathOper;

@RestController
@RequestMapping(path = "/api/div", produces = "application/json")
public class DivController {
	@PostMapping(consumes = "application/json")
	@CrossOrigin
	public Map<String, Object> getDiv(@RequestBody Request rq) {
		IMathOper div = (x, y) -> x.divide(y, 10, RoundingMode.HALF_UP);
		return new Response().add(
			"div", 
			div.result(rq.getFirst(), rq.getSecond())
		).getRs();
	}
}
