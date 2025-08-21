package br.com.dinizbit.a21club_api.service;

import br.com.dinizbit.a21club_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSevice {

    private final UserRepository userRepository;
}
