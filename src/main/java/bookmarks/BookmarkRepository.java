package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by wojciech.misiak on 10/18/2017.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {
    Collection<Bookmark>  findByAccountUsername(String username);
}
