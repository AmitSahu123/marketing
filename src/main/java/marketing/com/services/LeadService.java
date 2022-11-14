package marketing.com.services;

import java.util.List;

import marketing.com.entity.Lead;

public interface LeadService {
	public void savelead(Lead l);

	public List<Lead> listallleads();


	public void deleteOneMethod(long id);

	public Lead getById(long id);


}
