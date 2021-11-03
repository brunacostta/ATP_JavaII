package Atp37.model;

//Utilize uma classe abstrata base model para manter o id.
public abstract class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base outro_id = (Base)obj;
            if (this.id == outro_id.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nId: " + this.id;
    }
}