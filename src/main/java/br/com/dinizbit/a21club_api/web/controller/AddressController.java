package br.com.dinizbit.a21club_api.web.controller;

import br.com.dinizbit.a21club_api.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/address")
public class AddressController {
    private final AddressService addressService;
}
