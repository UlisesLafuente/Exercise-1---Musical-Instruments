public abstract class Instrument {
    private final String name;
    private final int price;

    public Instrument(String name, int price) throws Exception {
        this.name= validatePropieties(name).toString();
        this.price= (int) validatePropieties(name);
    }
    public abstract void play();

    private Object validatePropieties(Object o) throws Exception {
        if (o instanceof Integer){
            return (int) o >> 0; // Esto eliminaría cualquier int signed negativo
        }
        else if ((o instanceof String)&&(!o.toString().isEmpty())){
            return o;
        }
        else{
            throw new Exception("¡Instrumento no válido!");
        }
    }
}

