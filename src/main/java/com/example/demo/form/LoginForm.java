package com.example.demo.form;

import lombok.Data;

/**
 * ログイン画面フォーム
 * 
 * @author 81906
 *
 */
@Data
public class LoginForm {
	
	/**ログインID*/
	private String loginId;
	
	/**パスワード*/
	private String password;
}
