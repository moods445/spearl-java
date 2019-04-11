package com.modds.dao;

import com.modds.model.Excerpt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcerptDao extends JpaRepository<Excerpt, Long> {

}
