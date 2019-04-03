package mz.stdbank.test;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.Dependent;

/**
 * @author Mário Júnior
 */
@Dependent
public interface PointRepository extends JpaRepository<Point,Long> {



}
