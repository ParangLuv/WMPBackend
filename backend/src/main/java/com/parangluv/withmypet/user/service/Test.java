package com.parangluv.withmypet.user.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.repository.UserRepository;

public class Test {

	UserRepository ur = new UserRepository() {
		
		@Override
		public <S extends User> S findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends User> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public <S extends User> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <S extends User> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User findOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean exists(Long id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Iterable<? extends User> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(User entity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Page<User> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends User> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends User> List<S> save(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends User> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<User> findAll(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<User> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<User> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deleteInBatch(Iterable<User> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}
	};
	
}
