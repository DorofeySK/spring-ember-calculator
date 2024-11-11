package calcrestapi.controllers;

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
@RequestMapping(path = "/api/sub", produces = "application/json")
public class SubController {
	@PostMapping(consumes = "application/json")
	@CrossOrigin
	public Map<String, Object> getSub(@RequestBody Request rq) {
		IMathOper sub = (x, y) -> x.subtract(y);
		return new Response().add(
			"sub",
			sub.result(rq.getFirst(), rq.getSecond())
		).getRs();
	}
}

