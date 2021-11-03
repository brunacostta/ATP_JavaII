package Atp37.controller;

import java.util.ArrayList;

public class BaseController <T> {
    ArrayList<T> dados;

    public BaseController() {
        this.dados = new ArrayList<T>();
    }

    public void create(T obj) {
        this.dados.add(obj);
    }

    public ArrayList<T> read() {
        return this.dados;
    }

    public void update(T obj) {
        if (this.dados.contains(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj) {
        this.dados.remove(obj);
    }
}
