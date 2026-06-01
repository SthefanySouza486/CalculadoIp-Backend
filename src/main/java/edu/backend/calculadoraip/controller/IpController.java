package edu.backend.calculadoraip.controller;

import edu.backend.calculadoraip.dto.IpRequest;
import edu.backend.calculadoraip.dto.IpResponse;
import edu.backend.calculadoraip.service.IpCalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin(origins = "http://localhost:4200")
public class IpController {

    private final IpCalculatorService service;

    public IpController(IpCalculatorService service) {
        this.service = service;
    }

    @PostMapping("/calcular")
    public IpResponse calcular(@RequestBody IpRequest request) {
        return service.calcularRede(request);
    }
}
