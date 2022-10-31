package entities;

import java.util.Objects;

public class CommentEntity {

    private int id;
    private String title;
    private String post;
    // One to One
    private UserEntity createdBy;
    // One to One
    private GamePostEntity game;

    public CommentEntity() {
    }

    public CommentEntity(int id, String title, String post, UserEntity createdBy, GamePostEntity game) {
        this.id = id;
        this.title = title;
        this.post = post;
        this.createdBy = createdBy;
        this.game = game;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public UserEntity getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public GamePostEntity getGame() {
        return this.game;
    }

    public void setGame(GamePostEntity game) {
        this.game = game;
    }

    public CommentEntity id(int id) {
        setId(id);
        return this;
    }

    public CommentEntity title(String title) {
        setTitle(title);
        return this;
    }

    public CommentEntity post(String post) {
        setPost(post);
        return this;
    }

    public CommentEntity createdBy(UserEntity createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public CommentEntity game(GamePostEntity game) {
        setGame(game);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommentEntity)) {
            return false;
        }
        CommentEntity commentEntity = (CommentEntity) o;
        return id == commentEntity.id && Objects.equals(title, commentEntity.title)
                && Objects.equals(post, commentEntity.post) && Objects.equals(createdBy, commentEntity.createdBy)
                && Objects.equals(game, commentEntity.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, post, createdBy, game);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", post='" + getPost() + "'" +
                ", createdBy='" + getCreatedBy() + "'" +
                ", game='" + getGame() + "'" +
                "}";
    }
}
