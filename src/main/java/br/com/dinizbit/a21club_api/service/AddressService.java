package br.com.dinizbit.a21club_api.service;

import br.com.dinizbit.a21club_api.entity.Address;
import br.com.dinizbit.a21club_api.repository.AddressRpository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {
    private final AddressRpository addressRpository;

    @Transactional
    public Address save(Address address) {
        return addressRpository.save(address);
    }
}
