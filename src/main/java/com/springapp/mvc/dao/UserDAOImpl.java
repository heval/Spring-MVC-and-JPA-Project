package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by heval-Computer on 26.7.2015.
 */

@Repository
public class UserDAOImpl implements IUserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int userId) {
        User user=entityManager.find(User.class,userId);
        if(user !=null){
            entityManager.remove(user);
        }
    }

    @Override
    public User getUser(int userId) {
        return entityManager.find(User.class,userId);
    }

    @Override
    public List<User> getUserList() {
        CriteriaBuilder builder=entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query=builder.createQuery(User.class);
        query.select(query.from(User.class));
        TypedQuery<User> typedQuery=entityManager.createQuery(query);
        return typedQuery.getResultList();
    }
}
