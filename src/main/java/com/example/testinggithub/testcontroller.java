import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/info")
    public CustomResponse getLogInUser() {
        return "Hello world";
    }

}
