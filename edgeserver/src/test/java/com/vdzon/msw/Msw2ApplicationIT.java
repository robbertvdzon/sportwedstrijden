//package com.vdzon.msw;
//
//import com.vdzon.msw.servicelayer.model.User;
//import com.vdzon.msw.servicelayer.repository.UserRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.inject.Inject;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MijnsportwedstijdenApplication.class)
//@WebAppConfiguration
//public class Msw2ApplicationIT {
//
//	@Inject
//	UserRepository userRepository;
//
//	@Test
//	public void contextLoads() {
//		User user = userRepository.findByUsername("q");
//		System.out.println(user.getTeammembers().size());
//		System.out.println(user);
//
//	}
//
//}
