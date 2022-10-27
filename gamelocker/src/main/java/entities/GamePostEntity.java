package entities;

import java.util.Date;
import java.util.Objects;

public class GamePostEntity {
    private int id;
    private String title;
    private String post;
    private Date createdOn;
    private UserEntity createdBy;

    public GamePostEntity() {
    }

    public GamePostEntity(int id, String title, String post, Date createdOn, UserEntity createdBy) {
        this.id = id;
        this.title = title;
        this.post = post;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
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

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public UserEntity getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public GamePostEntity id(int id) {
        setId(id);
        return this;
    }

    public GamePostEntity title(String title) {
        setTitle(title);
        return this;
    }

    public GamePostEntity post(String post) {
        setPost(post);
        return this;
    }

    public GamePostEntity createdOn(Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    public GamePostEntity createdBy(UserEntity createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GamePostEntity)) {
            return false;
        }
        GamePostEntity gamePostEntity = (GamePostEntity) o;
        return id == gamePostEntity.id && Objects.equals(title, gamePostEntity.title)
                && Objects.equals(post, gamePostEntity.post) && Objects.equals(createdOn, gamePostEntity.createdOn)
                && Objects.equals(createdBy, gamePostEntity.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, post, createdOn, createdBy);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", post='" + getPost() + "'" +
                ", createdOn='" + getCreatedOn() + "'" +
                ", createdBy='" + getCreatedBy() + "'" +
                "}";
    }

}
