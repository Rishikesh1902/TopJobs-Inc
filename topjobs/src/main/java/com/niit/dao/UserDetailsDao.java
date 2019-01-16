package com.niit.dao;

import javax.persistence.EntityManager;

import com.niit.domain.UserDetails;
import com.niit.topjobs.PersistenceManager;

public class UserDetailsDao {

	public void persist(UserDetails entity) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}
	
}
