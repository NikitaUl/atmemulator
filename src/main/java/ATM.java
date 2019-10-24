import java.util.List;

public interface ATM {
    void putCash(List<Nominal> ListNM);
    void getCash(Integer sum);
}
