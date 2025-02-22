@Entity
public class Carpool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String driver;
    private int seatsAvailable;
    private String pickupLocation;

    // Getters and Setters
}
