package br.com.dinizbit.a21club_api.web.controller;

import br.com.dinizbit.a21club_api.entity.Address;
import br.com.dinizbit.a21club_api.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping()
    public ResponseEntity<Address> create(@RequestBody Address address){
        Address endereco = addressService.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(address);
    }


}
