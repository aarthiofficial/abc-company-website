package com.abccompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abccompany.model.Heading;

public interface HeadingRepository extends JpaRepository<Heading, Long> {
}
