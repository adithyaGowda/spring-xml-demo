package com.stackroute.domain;

public class Movie {

    private Actor actorObject;

    public void setActor(Actor actor) {
        this.actorObject = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actorObject +
                '}';
    }
}
