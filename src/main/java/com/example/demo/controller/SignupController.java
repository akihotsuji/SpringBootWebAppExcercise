package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SignupForm;
import com.example.demo.service.SignupService;

import lombok.RequiredArgsConstructor;


/**
 * ユーザー登録画面　Controller
 * 
 * @author 81906
 *
 */
@Controller
@RequiredArgsConstructor
public class SignupController {
	
	/**ログイン画面Service*/
	private final SignupService service;


	/**
	 * 初期表示
	 * @param modelモデル
	 * @param form入力情報
	 * @return 表示画面
	 */
	@GetMapping("/signup")
	public String view(Model model, SignupForm form) {
		
		return "signup"; //signup.htmlを返す
	}
	
	/**
	 * ユーザー登録
	 * @param modelモデル
	 * @param form入力情報
	 * @return 表示画面
	 */
	@PostMapping("/signup")
	public void login(Model model, SignupForm form) {
		service.resistryUserInfo(form);
	}
}
