package entities;

import java.util.Objects;

public class GamePostEntity {
    private int id;
    private String post;

    public GamePostEntity() {
    }

    public GamePostEntity(int id, String post) {
        this.id = id;
        this.post = post;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public GamePostEntity id(int id) {
        setId(id);
        return this;
    }

    public GamePostEntity post(String post) {
        setPost(post);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GamePostEntity)) {
            return false;
        }
        GamePostEntity gamePost = (GamePostEntity) o;
        return id == gamePost.id && Objects.equals(post, gamePost.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, post);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", post='" + getPost() + "'" +
                "}";
    }
}
