package gov.tn.dhs.micronaut.ecm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class StatusController {

    @Get("/ecm-api/v1/status")
    public String status() {
        return "ecm-api-micronaut is running";
    }

    @Get("/ping")
    public String ping() {
        return "ALIVE !!!";
    }

}
