import java.util.ArrayList;

void main() throws Exception {
    IO.println("Hello and welcome!");

    Instrument flute = new WindInstrument("Flute", 20);
    Instrument guitar = new StringInstrument("Guitar", 100);
    Instrument drum = new PercussionInstrument("drum", 150);

    ArrayList<Instrument> instrumentList = new ArrayList<>(List.of(flute, guitar, drum));

    for (Instrument o : instrumentList ) {
        o.play();
    }
}
