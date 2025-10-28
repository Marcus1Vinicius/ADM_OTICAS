package com.MV_dev.ADM_OTICA.controller;

import dto.CepresultadoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep") // dentro do parenteses vai a rota principal

public class ConsultaCepController {

    @GetMapping("{cep}")
   public CepresultadoDTO consultaCep (@PathVariable("cep") String cep){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity <CepresultadoDTO> resp =
                    restTemplate.getForEntity(String.format("https://viacep.com.br/ws/%s/json/", cep), CepresultadoDTO.class);
                    return resp.getBody();
    }
}
