package com.monitora.summer.gurgelws.repositories;

import com.monitora.summer.gurgelws.model.*;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository 
  extends PagingAndSortingRepository<Person, Long> {
}

