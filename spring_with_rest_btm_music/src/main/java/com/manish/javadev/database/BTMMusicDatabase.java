package com.manish.javadev.database;

import java.util.HashMap;
import java.util.Map;

import com.manish.javadev.model.UserEntity;

public class BTMMusicDatabase {
	private static Map<Integer, UserEntity> userMap = new HashMap<Integer, UserEntity>();

	static {

		// UserEntity Database
		UserEntity userEntity1 = new UserEntity(1, "Manish1", "Lucknow");
		UserEntity userEntity2 = new UserEntity(2, "Manish2", "Lucknow");
		UserEntity userEntity3 = new UserEntity(3, "Manish2", "Lucknow");
		UserEntity userEntity4 = new UserEntity(4, "Manish4", "Lucknow");
		UserEntity userEntity5 = new UserEntity(5, "Manish5", "Lucknow");

		userMap.put(1, userEntity1);
		userMap.put(2, userEntity2);
		userMap.put(3, userEntity3);
		userMap.put(4, userEntity4);
		userMap.put(5, userEntity5);

	}

	public static Map<Integer, UserEntity> getUserMap() {
		return userMap;
	}

	public static void setUserMap(Map<Integer, UserEntity> userMap) {
		BTMMusicDatabase.userMap = userMap;
	}
}
