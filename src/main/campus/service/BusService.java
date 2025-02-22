@Service
public class BusService {
    @Autowired private BusRepository busRepo;
    
    public List<Bus> getAllBuses() { return busRepo.findAll(); }
}
