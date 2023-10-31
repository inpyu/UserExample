package com.sdevgenians.sdev.user;

import com.sdevgenians.sdev.user.dto.UserCreateDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User UserCreate(UserCreateDTO userCreateDTO){
        User user = User.builder()
            .email(userCreateDTO.getEmail())
            .password(userCreateDTO.getPassword())
                .build();

        userRepository.save(user);

        return user;
    }


}
