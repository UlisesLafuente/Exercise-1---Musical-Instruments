import java.util.ArrayList;

void main() {
    IO.println(String.format("Hello and welcome!"));

    Instrument flute = new WindInstrument();
    Instrument guitar = new StringInstrument();
    Instrument drum = new PercussionInstrument();

    ArrayList<Instrument> instrumentList = new ArrayList<>(List.of(flute, guitar, drum));

    for (Instrument o : instrumentList ) {
        o.play();
    }
}
