package entities;

import java.util.List;
import java.util.Objects;

import org.apache.catalina.User;

public class GameEntity {

    private int id;
    private String name;
    private String description;
    private int genre;
    private UserEntity user;
    private List<GamePostEntity> gamePosts;

    public GameEntity() {
    }

    public GameEntity(int id, String name, String description, int genre, UserEntity user,
            List<GamePostEntity> gamePosts) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.user = user;
        this.gamePosts = gamePosts;
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

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<GamePostEntity> getGamePosts() {
        return this.gamePosts;
    }

    public void setGamePosts(List<GamePostEntity> gamePosts) {
        this.gamePosts = gamePosts;
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

    public GameEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public GameEntity gamePosts(List<GamePostEntity> gamePosts) {
        setGamePosts(gamePosts);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameEntity)) {
            return false;
        }
        GameEntity gameEntity = (GameEntity) o;
        return id == gameEntity.id && Objects.equals(name, gameEntity.name)
                && Objects.equals(description, gameEntity.description) && genre == gameEntity.genre
                && Objects.equals(user, gameEntity.user) && Objects.equals(gamePosts, gameEntity.gamePosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, genre, user, gamePosts);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                ", genre='" + getGenre() + "'" +
                ", user='" + getUser() + "'" +
                ", gamePosts='" + getGamePosts() + "'" +
                "}";
    }
}
