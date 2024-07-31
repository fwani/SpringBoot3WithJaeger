package pe.fwani.springboot3withjaeger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Created by fwani.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}
