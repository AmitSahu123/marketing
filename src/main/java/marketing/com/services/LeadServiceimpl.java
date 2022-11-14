package marketing.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marketing.com.entity.Lead;
import marketing.com.repositiory.LeadRepositiory;

@Service
public class LeadServiceimpl implements LeadService {
	
	@Autowired
	private LeadRepositiory leadRepo;

	@Override
	public void savelead(Lead l) {
		leadRepo.save(l);
	}

	@Override
	public List<Lead> listallleads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
		
	}

	@Override
	public void deleteOneMethod(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead getById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
		
	}
	

}
