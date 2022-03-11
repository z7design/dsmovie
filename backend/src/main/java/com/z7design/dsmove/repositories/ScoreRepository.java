package com.z7design.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.z7design.dsmove.entities.Score;
import com.z7design.dsmove.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
