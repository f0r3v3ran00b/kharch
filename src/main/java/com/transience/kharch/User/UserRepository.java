package com.transience.kharch.User;

import com.transience.kharch.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanju on 19/08/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}