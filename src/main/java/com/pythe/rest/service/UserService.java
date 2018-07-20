package com.pythe.rest.service;

import com.pythe.common.pojo.PytheResult;

public interface UserService {

	PytheResult register(String params);

	PytheResult login(String params);

}
