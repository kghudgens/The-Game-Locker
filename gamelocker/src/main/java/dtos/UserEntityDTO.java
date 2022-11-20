package dtos;

import java.util.List;

import entities.CommentEntity;
import entities.GameEntity;
import entities.GamePostEntity;

public class UserEntityDTO {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private List<GameEntity> games;
    private List<GamePostEntity> userPosts;
    private List<CommentEntity> userComments;

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
