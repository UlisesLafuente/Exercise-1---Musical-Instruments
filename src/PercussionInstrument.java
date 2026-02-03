public class PercussionInstrument extends Instrument{

    PercussionInstrument(String name, int price){
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de percusió.");
    }
}
