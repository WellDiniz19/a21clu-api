package br.com.dinizbit.a21club_api.service;

import br.com.dinizbit.a21club_api.repository.AddressRpository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {
    private final AddressRpository addressRpository;
}
