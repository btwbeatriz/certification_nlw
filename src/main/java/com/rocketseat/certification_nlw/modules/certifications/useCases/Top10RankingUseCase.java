package com.rocketseat.certification_nlw.modules.certifications.useCases;

import com.rocketseat.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.rocketseat.certification_nlw.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Top10RankingUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public List<CertificationStudentEntity> execute() {
        var result = this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
        return result;
    }
}
