package com.rocketseat.certification_nlw.modules.students.useCases;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto){
        if (dto.getEmail().equals("beatriz@email.com") && dto.getTechnology().contentEquals("Java")){
            return true;
        }
        return false;
    }
}
