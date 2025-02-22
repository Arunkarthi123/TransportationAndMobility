@RestController
@RequestMapping("/carpool")
public class CarpoolController {
    @Autowired private CarpoolService carpoolService;

    @GetMapping
    public List<Carpool> getAllCarpools() {
        return carpoolService.getAllCarpools();
    }
}
