package me.swat018.demojpa2.Post;

import me.swat018.demojpa2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
