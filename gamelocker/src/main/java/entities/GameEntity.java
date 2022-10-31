package entities;

import java.util.List;
import java.util.Objects;

public class GameEntity {

    private int id;
    private String gameTitle;
    private String gameDescription;
    private int genre;
    private UserEntity user;
    private List<GamePostEntity> gamePosts;

    public GameEntity() {
    }

    public GameEntity(int id, String gameTitle, String gameDescription, int genre, UserEntity user,
            List<GamePostEntity> gamePosts) {
        this.id = id;
        this.gameTitle = gameTitle;
        this.gameDescription = gameDescription;
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

    public String getgameTitle() {
        return this.gameTitle;
    }

    public void setgameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getgameDescription() {
        return this.gameDescription;
    }

    public void setgameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
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

    public GameEntity gameTitle(String gameTitle) {
        setgameTitle(gameTitle);
        return this;
    }

    public GameEntity gameDescription(String gameDescription) {
        setgameDescription(gameDescription);
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
        return id == gameEntity.id && Objects.equals(gameTitle, gameEntity.gameTitle)
                && Objects.equals(gameDescription, gameEntity.gameDescription) && genre == gameEntity.genre
                && Objects.equals(user, gameEntity.user) && Objects.equals(gamePosts, gameEntity.gamePosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gameTitle, gameDescription, genre, user, gamePosts);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", gameTitle='" + getgameTitle() + "'" +
                ", gameDescription='" + getgameDescription() + "'" +
                ", genre='" + getGenre() + "'" +
                ", user='" + getUser() + "'" +
                ", gamePosts='" + getGamePosts() + "'" +
                "}";
    }
}
