package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class controller {

    @Operation(summary = "Saluta l'utente", description = "Restituisce un messaggio di benvenuto")
    @ApiResponse(responseCode = "200", description = "Saluto restituito correttamente")
    @GetMapping("/hello")
    public String sayHello() {
        return "Ciao Nicolò, Swagger funziona!";
    }
}