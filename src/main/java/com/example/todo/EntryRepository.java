package com.example.todo;

import org.springframework.data.repository.CrudRepository;

// see : https://www.baeldung.com/spring-data-repositories

// I think we should use a PagingAndSortingRepository

public interface EntryRepository extends CrudRepository<Entry, Long> {

}
