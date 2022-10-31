package entities;

import java.util.List;
import java.util.Objects;

public class UserEntity {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private List<GameEntity> games;
    private List<GamePostEntity> userPosts;
    private List<CommentEntity> userComments;

    public UserEntity() {
    }

    public UserEntity(int id, String firstName, String lastName, int age, String email, List<GameEntity> games,
            List<GamePostEntity> userPosts, List<CommentEntity> userComments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.games = games;
        this.userPosts = userPosts;
        this.userComments = userComments;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GameEntity> getGames() {
        return this.games;
    }

    public void setGames(List<GameEntity> games) {
        this.games = games;
    }

    public List<GamePostEntity> getUserPosts() {
        return this.userPosts;
    }

    public void setUserPosts(List<GamePostEntity> userPosts) {
        this.userPosts = userPosts;
    }

    public List<CommentEntity> getUserComments() {
        return this.userComments;
    }

    public void setUserComments(List<CommentEntity> userComments) {
        this.userComments = userComments;
    }

    public UserEntity id(int id) {
        setId(id);
        return this;
    }

    public UserEntity firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public UserEntity lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public UserEntity age(int age) {
        setAge(age);
        return this;
    }

    public UserEntity email(String email) {
        setEmail(email);
        return this;
    }

    public UserEntity games(List<GameEntity> games) {
        setGames(games);
        return this;
    }

    public UserEntity userPosts(List<GamePostEntity> userPosts) {
        setUserPosts(userPosts);
        return this;
    }

    public UserEntity userComments(List<CommentEntity> userComments) {
        setUserComments(userComments);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) o;
        return id == userEntity.id && Objects.equals(firstName, userEntity.firstName)
                && Objects.equals(lastName, userEntity.lastName) && age == userEntity.age
                && Objects.equals(email, userEntity.email) && Objects.equals(games, userEntity.games)
                && Objects.equals(userPosts, userEntity.userPosts)
                && Objects.equals(userComments, userEntity.userComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, email, games, userPosts, userComments);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", age='" + getAge() + "'" +
                ", email='" + getEmail() + "'" +
                ", games='" + getGames() + "'" +
                ", userPosts='" + getUserPosts() + "'" +
                ", userComments='" + getUserComments() + "'" +
                "}";
    }
}
