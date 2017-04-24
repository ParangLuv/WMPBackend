package com.parangluv.withmypet;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.parangluv.withmypet.messagebox.domain.MessageBox;
import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.domain.UserAuthority;
import com.parangluv.withmypet.user.repository.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

	
	@Autowired
	UserRepository ur;
	
	@Test
	public void contextLoads() {
		User user = new User();
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setDeleted(false);
		user.setEmail("test@test.com");
		user.setEnabled(true);
		user.setIncorrectPasswordInputNo(0);
		user.setLastChangePasswordDate(new Date());
		user.setLastLoginDate(new Date());
		user.setModDate(new Timestamp(0));
		user.setPassword("test");
		user.setRegDate(new Timestamp(0));
		user.setUserAuthority(UserAuthority.USER);
		user.setUserName("test");		
		ur.save(user);
	}

}
