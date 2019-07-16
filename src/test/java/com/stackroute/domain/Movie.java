package com.stackroute.domain;

public class Movie {

    private Actor actor,actor1,actor2;



    public Movie() {
    }

    public Movie(Actor actor,Actor actor1,Actor actor2) {
        this.actor = actor;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    /*public void setActor(Actor actor) {
        this.actor = actor;
    }
*/

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actor1=" + actor1 +
                ", actor2=" + actor2 +
                '}';
    }
}
