package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * USERS����Ӧ��ʵ���ࣺ���ڷ�װUSERS����һ���û���Ϣ
 * 
 * @author ����
 *
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 2504015899170623862L;

	/**
	 * �û����
	 */
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	/**
	 * �û�����
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * �û�����
	 */
	@Column(name = "user_psw")
	private String userPsw;

	/**
	 * �û��Ա�0�У�1Ů
	 */
	@Column(name = "user_sex")
	private Integer userSex;

	/**
	 * �û�����֤����
	 */
	@Column(name = "user_idnum")
	private String userIdnum;

	/**
	 * �û���ϵ�绰
	 */
	@Column(name = "user_tel")
	private String userTel;

	/**
	 * �û��������ڣ�yyyy-MM-dd
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;

	/**
	 * �û�����
	 */
	@Column(name = "user_email")
	private String userEmail;

	/**
	 * �û�ͷ��
	 */
	@Column(name = "user_image")
	private String userImage;

	/**
	 * �û�Ȩ�ޱ��
	 */
	@Column(name = "permission_id")
	private Integer permissionId;

	/**
	 * �û���ַ
	 */
	@Column(name = "user_addr")
	private String userAddr;

	/**
	 * �û�״̬:0���ã�1����
	 */
	@Column(name = "user_status")
	private Integer userStatus;
	

}