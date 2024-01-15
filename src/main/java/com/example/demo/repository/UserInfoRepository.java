package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserInfo;

/**
 * ユーザー情報テーブルDAO
 * 
 * @author 81906
 *
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,String>{

}
