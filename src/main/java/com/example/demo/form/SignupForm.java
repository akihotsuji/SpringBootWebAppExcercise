package com.example.demo.form;

import lombok.Data;

/**
 * ユーザー登録画面フォーム
 * 
 * @author 81906
 *
 */
@Data
public class SignupForm {
	
	/**ログインID*/
	private String loginId;
	
	/**パスワード*/
	private String password;
}
