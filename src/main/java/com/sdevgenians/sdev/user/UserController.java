package com.sdevgenians.sdev.user;

import static com.sdevgenians.sdev.common.SuccessStatus.SUCCESS;

import com.sdevgenians.sdev.common.SuccessResponse;
import com.sdevgenians.sdev.user.dto.UserCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/sign-up")
    public SuccessResponse<User> createUser(@RequestBody UserCreateDTO userCreateDTO) {
        User user = userService.UserCreate(userCreateDTO);
        return new SuccessResponse<>(SUCCESS, user);
    }
}
