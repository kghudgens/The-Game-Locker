package daos;

import java.util.List;

import entities.CommentEntity;
import entities.GamePostEntity;
import entities.UserEntity;

public interface UserEntityDAO {

    public String getUserFullName();

    public int getUserAge(UserEntity user);

    public String getUserEmail(UserEntity user);

    public List<UserEntity> getAllUsers();

    public List<GamePostEntity> getAllUserPosts(UserEntity user);

    public List<CommentEntity> getAllUserComments(UserEntity user);

    public void updateUser(UserEntity user);

    public void deleteUser(UserEntity user);
}
