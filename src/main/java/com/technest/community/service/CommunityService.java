package com.technest.community.service;

import com.technest.community.models.Community;
import com.technest.community.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    private CommunityRepository communityRepository;

    @Autowired
    public CommunityService(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }


}
