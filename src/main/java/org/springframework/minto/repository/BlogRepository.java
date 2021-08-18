package org.springframework.minto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.minto.model.Blog;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Long> {
}
