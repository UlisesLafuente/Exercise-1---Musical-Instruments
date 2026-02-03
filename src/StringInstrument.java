public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) throws Exception {
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de corda.");
    }
}
