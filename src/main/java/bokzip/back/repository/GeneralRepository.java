package bokzip.back.repository;

import bokzip.back.domain.General;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //DI
public interface GeneralRepository extends JpaRepository<General, Long> {

    List<General> findAllBy();
}
