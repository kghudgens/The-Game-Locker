package entities;

import java.util.Objects;

public class GameEntity {

    private int id;
    private String name;
    private String description;
    private int genre;

    public GameEntity() {
    }

    public GameEntity(int id, String name, String description, int genre) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGenre() {
        return this.genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public GameEntity id(int id) {
        setId(id);
        return this;
    }

    public GameEntity name(String name) {
        setName(name);
        return this;
    }

    public GameEntity description(String description) {
        setDescription(description);
        return this;
    }

    public GameEntity genre(int genre) {
        setGenre(genre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameEntity)) {
            return false;
        }
        GameEntity GameEntity = (GameEntity) o;
        return id == GameEntity.id && Objects.equals(name, GameEntity.name)
                && Objects.equals(description, GameEntity.description)
                && genre == GameEntity.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, genre);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                ", genre='" + getGenre() + "'" +
                "}";
    }
}
