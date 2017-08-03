package com.manish.javadev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.manish.javadev.database.BTMMusicDatabase;
import com.manish.javadev.model.UserEntity;

/**
 * @author Manish
 *
 */
public class BTMMusicService {

	public static UserEntity userInfo(Integer id) {
		return BTMMusicDatabase.getUserMap().get(id);
	}

	public static List<UserEntity> usersInfo() {
		List<UserEntity> userList = new ArrayList<UserEntity>();
		Set<Entry<Integer, UserEntity>> set = BTMMusicDatabase.getUserMap().entrySet();
		for (Entry<Integer, UserEntity> entry : set) {
			userList.add(entry.getValue());
		}
		return userList;
	}

	public static UserEntity createUser(UserEntity userEntity) {
		int size = BTMMusicDatabase.getUserMap().size() + 1;
		userEntity.setUserId(size);
		BTMMusicDatabase.getUserMap().put(size, userEntity);
		return userEntity;
	}

	public static UserEntity updateUser(Integer userId, UserEntity userEntity) {

		UserEntity userEntityNew = new UserEntity(userEntity.getUserId(), userEntity.getUserName(),
				userEntity.getLocation());
		BTMMusicDatabase.getUserMap().put(userId, userEntityNew);

		return BTMMusicDatabase.getUserMap().get(userId);
	}

	public static List<UserEntity> deleteUser(Integer userId) {
		BTMMusicDatabase.getUserMap().remove(userId);
		List<UserEntity> userList = new ArrayList<UserEntity>();
		Set<Entry<Integer, UserEntity>> set = BTMMusicDatabase.getUserMap().entrySet();
		for (Entry<Integer, UserEntity> entry : set) {
			userList.add(entry.getValue());
		}
		return userList;
	}

}
