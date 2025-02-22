@Service
public class CarpoolService {
    @Autowired private CarpoolRepository carpoolRepo;

    public List<Carpool> getAllCarpools() { return carpoolRepo.findAll(); }
}
