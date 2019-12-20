package ro.kluger.java.spital.service;

import com.querydsl.core.BooleanBuilder;
import ro.kluger.java.spital.dto.FilterProgramareDTO;
import ro.kluger.java.spital.entity.Programare;
import ro.kluger.java.spital.entity.QProgramare;
import ro.kluger.java.spital.repository.ProgramareRepository;

import java.util.Date;
import java.util.List;

public class ProgramareFilterService {

    private final ProgramareRepository programareRepository;
    private final QProgramare qProgramare = QProgramare.programare;

    public ProgramareFilterService(final ProgramareRepository programareRepository) {
        this.programareRepository = programareRepository;
    }

    public List<Programare> filterProgramare(FilterProgramareDTO filterDTO){
        return null;
    }

    private BooleanBuilder buildFilter(FilterProgramareDTO filterDTO){
        BooleanBuilder where = new BooleanBuilder();
        return where;
    }

    private BooleanBuilder doctorNameClause(BooleanBuilder where, String doctorName){
        if(doctorName!=null && !doctorName.isEmpty()){
            return where.and(qProgramare.doctor.persoana.nume.containsIgnoreCase(doctorName));
        }
        return where;
    }

    private BooleanBuilder pacientNameClause(BooleanBuilder where, String patientName){
        if(patientName!=null && !patientName.isEmpty()){
            return where.and(qProgramare.pacient.persoana.nume.containsIgnoreCase(patientName));
        }
        return where;
    }

    private BooleanBuilder dateClause(BooleanBuilder where, Date date){
        if(date!=null){
            return where.and(null);
        }
        return where;
    }
}
