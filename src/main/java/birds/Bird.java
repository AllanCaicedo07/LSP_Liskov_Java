package birds;

/**
 *  SOLUCIÓN LSP — Clase base Bird (solo lo que TODOS los pájaros hacen)
 *
 * La trampa clásica es incluir fly() aquí, asumiendo que todos los pájaros vuelan.
 * El pingüino no vuela → si hereda Bird con fly(), viola LSP.
 *
 * SOLUCIÓN: Bird define solo comportamiento universal (eat()).
 * Volar se delega a la interface Flyable, implementada solo por aves voladoras.
 */
public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    /** Todos los pájaros comen — invariante segura */
    public abstract void eat();

    public String getName() { return name; }
}
