import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final String id;
    private final String type;
    private final Long amount;
    private final LocalDateTime timastamp;

    public Transaction(String type, Long amount){
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.timastamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Long getAmount() {
        return amount;
    }

    public LocalDateTime getTimastamp() {
        return timastamp;
    }
}
