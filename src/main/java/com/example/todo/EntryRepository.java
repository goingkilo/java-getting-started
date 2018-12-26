package com.example.todo;

import org.springframework.data.jpa.repository.JpaRepository;

// see : https://www.baeldung.com/spring-data-repositories
// I think we should use a PagingAndSortingRepository

public interface EntryRepository extends JpaRepository<Entry, Long> {

}
