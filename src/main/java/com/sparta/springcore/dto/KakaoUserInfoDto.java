package com.sparta.springcore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor //주석처리된 부분을 실제적으로 만들어줌
public class KakaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

//    public KakaoUserInfoDto(Long id, String nickname, String email){
//
//        this.id = id;
//        this.nickname = nickname;
//        this.email= email;
//    }

   //@Getter가 없었다면.. public Long getId() { return id; }



}
