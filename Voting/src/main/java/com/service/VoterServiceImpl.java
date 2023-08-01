package com.service;

import com.model.Voter;
import com.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {
    @Autowired
    private VoterRepository voterRepository;

    @Override
    public Voter createVoter(Voter voter) {
        return voterRepository.save(voter);
    }

    // Other voter-related implementations
}
