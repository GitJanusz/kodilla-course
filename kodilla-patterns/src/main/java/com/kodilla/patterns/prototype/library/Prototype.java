package com.kodilla.patterns.prototype.library;

public class Prototype<L> implements Cloneable {
    @Override
    protected L clone() throws CloneNotSupportedException {
        return (L)super.clone();
    }
}
