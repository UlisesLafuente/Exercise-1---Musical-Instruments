public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price) throws Exception {
        super(name, price);
    }

    @Override
    public void play(){
        System.out.println("Està sonant un instrument de vent.");
    }
}
