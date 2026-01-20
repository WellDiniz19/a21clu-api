package br.com.dinizbit.a21club_api.service;

import br.com.dinizbit.a21club_api.entity.User;
import br.com.dinizbit.a21club_api.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSevice {

    private final UserRepository userRepository;

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }
}
