import java.util.ArrayList;

class Flute {
    private String scale;
    private String material;

    public Flute(String scale, String material) {
        this.scale = scale;
        this.material = material;
    }

    public String play() {
        return "Playing " + scale + " flute.";
    }

    public String getFunctionality() {
        return scale + " flute sound.";
    }
}

class CSharpFlute extends Flute {
    public CSharpFlute(String material) {
        super("C#", material);
    }

    @Override
    public String getFunctionality() {
        return " good for classical music.";
    }
}

class ASharpFlute extends Flute {
    public ASharpFlute(String material) {
        super("A#", material);
    }

    @Override
    public String getFunctionality() {
        return " perfect for Bollywood songs.";
    }
}

class GSharpFlute extends Flute {
    public GSharpFlute(String material) {
        super("G#", material);
    }

    @Override
    public String getFunctionality() {
        return " famous for folk music.";
    }
}

public class FluteHarmony {
    public static void main(String[] args) {
        ArrayList<Flute> flutes = new ArrayList<>();
        
        flutes.add(new CSharpFlute("Bamboo"));
        flutes.add(new ASharpFlute("Metal"));
        flutes.add(new GSharpFlute("Wood"));
    

        System.out.println(flutes.get(0).play() + " " + flutes.get(0).getFunctionality());
        System.out.println(flutes.get(1).play() + " " + flutes.get(1).getFunctionality());
        System.out.println(flutes.get(2).play() + " " + flutes.get(2).getFunctionality());
    }
}
