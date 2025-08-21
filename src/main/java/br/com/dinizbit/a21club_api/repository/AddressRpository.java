package br.com.dinizbit.a21club_api.repository;

import br.com.dinizbit.a21club_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRpository extends JpaRepository<Address, Long> {
}
