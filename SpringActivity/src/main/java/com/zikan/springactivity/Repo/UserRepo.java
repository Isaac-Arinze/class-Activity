package com.zikan.springactivity.Repo;

import com.zikan.springactivity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {


}
