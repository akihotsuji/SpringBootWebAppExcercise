package com.example.demo.service;

import org.dozer.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ユーザー登録画面Service
 * 
 * @author 81906
 *
 */
@Service
@RequiredArgsConstructor
public class SignupService {
	
	/**ユーザー情報テーブルDAO*/
	private final UserInfoRepository repository;
	
	/**Dozer Mapper*/
	private final Mapper mapper;
	
	
	/** PasswordEncoder*/
	private final PasswordEncoder passwordEncoder;
	
	/**
	 * ユーザー情報テーブル 新規登録
	 * 
	 * @param form 入力情報
	 * @return 登録情報ユーザー情報Entity
	 */
	public UserInfo resistryUserInfo(SignupForm form){
		
		//以下は愚直なformから登録情報を取ってきてuserInfoにセットする処理
		//var userInfo = new UserInfo();
		//userInfo.setLoginId(form.getLoginId());
		//userInfo.setPassword(form.getPassword());
		
		var userInfo = mapper.map(form, UserInfo.class);
		
		var encodedPassword = passwordEncoder.encode(form.getPassword());
		userInfo.setPassword(encodedPassword);
		
		return repository.save(userInfo);
	}

}
