package com.transience.kharch.repository;

import com.transience.kharch.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sanju on 9/08/2016.
 */
@RepositoryRestResource(itemResourceRel="user", collectionResourceRel = "user", path = "user")
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor {
}
