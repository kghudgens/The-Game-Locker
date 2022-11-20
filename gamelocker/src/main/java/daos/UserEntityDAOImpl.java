package daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.springframework.data.jpa.provider.HibernateUtils;

import entities.CommentEntity;
import entities.GamePostEntity;
import entities.UserEntity;

public class UserEntityDAOImpl implements UserEntityDAO {

    @Inject
    private HibernateUtils hibernateUtils;

    @Override
    public String getUserFullName() {

        return null;
    }

    @Override
    public int getUserAge(UserEntity user) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getUserEmail(UserEntity user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        Session session = HibernateUtils.getHibernateSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        return;
    }

    @Override
    public List<GamePostEntity> getAllUserPosts(UserEntity user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CommentEntity> getAllUserComments(UserEntity user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateUser(UserEntity user) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteUser(UserEntity user) {
        // TODO Auto-generated method stub

    }

}
