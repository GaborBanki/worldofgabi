import java.util.ArrayList;

public class Player {
    public Scene scene;
    private ArrayList<Item> inventory;

    public Player(Scene startingScene) {
        this.scene = startingScene;
        inventory = new ArrayList<>();
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void takeItem(Item item) {
        inventory.add(item);
    }

    public String getInventoryString() {
        if (inventory.isEmpty()) {
            return "A leltárad üres!";
        }
        // A StringBuilder objektumot olyan szituációkban használjuk,
        // mint például egy loop, ahol sok Stringet fűzünk össze (concate-nálunk)
        // Ez azért kell, mert a Java-ban a String imutabl, és egyébként mindig újat, ami költséges művelet, lassú lenne
        StringBuilder returnString = new StringBuilder();
        for (Item item : inventory) {
            returnString.append(" ").append(item.getName());
        }
        return returnString.toString();
    }
}
