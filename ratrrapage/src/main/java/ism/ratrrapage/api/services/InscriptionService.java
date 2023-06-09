package ism.ratrrapage.api.services;

import ism.ratrrapage.api.dto.InscriptionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InscriptionService {

    List<InscriptionDto> getAllInscription();

    InscriptionDto addInscription(InscriptionDto inscriptionDto);
}
