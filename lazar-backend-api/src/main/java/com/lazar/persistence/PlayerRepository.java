package com.lazar.persistence;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Properties;

@Repository
public class PlayerRepository {

    @Autowired
    private Jdbi jdbi;

    @Autowired
    private Properties queries;

}