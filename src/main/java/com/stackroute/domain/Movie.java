package com.stackroute.domain;

public class Movie {

    Actor actorObject;

    public Movie(Actor actorObject) {
        this.actorObject = actorObject;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorObject=" + actorObject +
                '}';
    }
}
