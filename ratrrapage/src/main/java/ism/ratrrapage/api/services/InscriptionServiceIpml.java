package ism.ratrrapage.api.services;

import ism.ratrrapage.api.dto.InscriptionDto;
import ism.ratrrapage.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InscriptionServiceIpml implements InscriptionService{
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Override
    public List<InscriptionDto> getAllInscription() {
        return inscriptionRepository.findAll()
                .stream().map(inscription -> new InscriptionDto(inscription))
                .collect(Collectors.toList());
    }

    @Override
    public InscriptionDto addInscription(InscriptionDto moduleDto) {
        return null;
    }
}
