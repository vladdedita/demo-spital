package ro.kluger.java.spital.service;

import org.springframework.stereotype.Service;
import ro.kluger.java.spital.repository.ProgramareRepository;

@Service
public class ProgramareService {

    private final ProgramareRepository programareRepository;

    public ProgramareService(final ProgramareRepository programareRepository) {
        this.programareRepository = programareRepository;
    }


}
