public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String name, int price) throws Exception {
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de percusió.");
    }
}
