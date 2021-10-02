package com.sparta.springcore.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class User {

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id //PK로 설정
    private Long  id;

    // nullable: null 허용 여부 값이 비워지면 안된다.
// unique: 중복 허용 여부 (false 일때 중복 허용) unique 유일무이한 값이 허용되나 안되나
// 원래 디폴드값은 *기본값은 unique = false 로 설정됨 그래서 굳이 따로 쓸 필요는 없음
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING) //ENUM값으로 저장되는게 아니라 sTIRNG으로 저장됨
    private UserRoleEnum role;

    //(nullable = true)는 디폴트 값이라 안적어줘도됨
    @Column(unique = true)
    private Long kakaoId;


    //생성자
//일반 form을 사용하던 생성자
    public User(String username, String password, String email, UserRoleEnum role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.kakaoId = null;

    }

    //카카오오톡 으로 가입한 자
    public User(String username, String password, String email, UserRoleEnum role, Long kakaoId) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.kakaoId =kakaoId;
    }


}