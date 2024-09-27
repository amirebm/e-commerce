package com.amir.dreamshops.service.user;

import com.amir.dreamshops.dto.UserDto;
import com.amir.dreamshops.model.User;
import com.amir.dreamshops.request.CreateUserRequest;
import com.amir.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
