package com.uap.it1311l.passwordencryptorapi.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;

@Mapper
public interface RegistrationMybatisRepository {
	@Insert
	("INSERT INTO attendees(encryptedPassword) VALUES (#{encryptedPassword})")
	public int insert(EncryptionResponse encryptionresponse);
}
