package marketing.com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import marketing.com.entity.Lead;

public interface LeadRepositiory extends JpaRepository<Lead, Long> {

}
