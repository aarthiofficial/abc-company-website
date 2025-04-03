package com.abccompany.service;

import com.abccompany.model.Heading;
import com.abccompany.repository.HeadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadingService {
    @Autowired
    private HeadingRepository headingRepository;

    public Heading saveHeading(Heading heading) {
        return headingRepository.save(heading);
    }

    public List<Heading> getAllHeadings() {
        return headingRepository.findAll();
    }

    public Heading getLatestHeading() {
        return headingRepository.findAll().stream().reduce((first, second) -> second).orElse(null);
    }
}
