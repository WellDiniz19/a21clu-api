package br.com.dinizbit.a21club_api.repository;

import br.com.dinizbit.a21club_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
