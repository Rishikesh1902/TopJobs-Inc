package com.niit.domain.test;


import java.util.Date;

import org.junit.jupiter.api.Test;

import com.niit.dao.UserDetailsDao;
import com.niit.domain.UserDetails;

class UserDetailsTest {

	@Test
	void userdetailspersist() {
		UserDetailsDao udd = new UserDetailsDao();
		UserDetails ud = new UserDetails();
		
		ud.setStatus(true);
		ud.setValidDate(new Date());
	}
}
