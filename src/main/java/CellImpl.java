public class CellImpl implements Cell {

    private final Nominal nominal;
    private Integer count;

    public CellImpl(Nominal nominal, Integer count){
        this.nominal = nominal;
        this.count = count;
    }

    public void put(Integer count) {
        this.count += count;
    }

    public Integer get(Integer count) {
        Integer toReturn = this.count>=count?count:this.count;
        this.count -= toReturn;
        return toReturn;
    }

    public Integer getCount() {
        return this.count;
    }

    public Nominal getNominal() {
        return this.nominal;
    }
}
