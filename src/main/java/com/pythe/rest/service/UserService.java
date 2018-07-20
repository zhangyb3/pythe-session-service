package com.pythe.rest.service;

import com.pythe.common.pojo.PytheResult;

public interface UserService {

	PytheResult register(String params);

	PytheResult login(String params);

	PytheResult tokenLogin(String token, String params);

	PytheResult resetPassword(String parameters);

	PytheResult verificationCodeLogin(String parameters);

	PytheResult tokenLogout(String token, String parameters);

}
