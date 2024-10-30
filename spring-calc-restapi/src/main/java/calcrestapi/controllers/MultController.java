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
@RequestMapping(path = "/api/mult", produces = "application/json")
public class MultController {
	@PostMapping(consumes = "application/json")
	public Map<String, Object> getMult(@RequestBody Request rq) {
		IMathOper mult = (x, y) -> x.multiply(y);
		return new Response().add(
			"mult",
			mult.result(rq.getFirst(), rq.getSecond())
		).getRs();
	}
}
