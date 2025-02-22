@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }
}
