package name.ealen.dao;

import name.ealen.entity.LinkMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author: zyl
 * @Date: 2020/7/17 7:14
 */
public interface LinkManRepository extends JpaRepository<LinkMan, Long>, JpaSpecificationExecutor<LinkMan> {
}
