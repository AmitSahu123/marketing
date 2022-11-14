package marketing.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import marketing.com.dto.Leaddata;
import marketing.com.entity.Lead;
import marketing.com.services.LeadService;
import marketing.com.util.EmailServiceImpl;
import marketing.com.util.EmailSevice;

@Controller
public class LeadController {
	
	@Autowired
	private EmailSevice emailservice;
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewpage")
	public String view() {
		return "create_lead";
		}
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String savelead(@ModelAttribute("lead") Lead l,ModelMap model) {
		leadService.savelead(l);
		emailservice.sendSimpleMail(l.getEmail(), "Test", "Test Email");
		model.addAttribute("msg","lead is save");
		return "create_lead";
		
	}
	
//	@RequestMapping(value="/save" ,method=RequestMethod.POST)
//	public String savelead(@RequestParam("firstname") String fname,@RequestParam("lastname") String lname,@RequestParam("email") String email,@RequestParam("mobile") String mobile) {
//		Lead lead=new Lead();
//		lead.setFirstname(fname);
//		lead.setLasttname(lname);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		leadService.savelead(lead);
//		return "create_lead";
//		
//	}
	
//	@RequestMapping(value="/save" ,method=RequestMethod.POST)
//	public String savelead(Leaddata data) {
//		Lead lead=new Lead();
//		lead.setFirstname(data.getFirstname());
//		lead.setLasttname(data.getLastname());
//		lead.setEmail(data.getEmail());
//		lead.setMobile(data.getMobile());
//		leadService.savelead(lead);
//		return "create_lead";
//		
//	}
	@RequestMapping("/listall")
	public String lisatallleads(ModelMap model) {
		List<Lead> leads = leadService.listallleads();
		model.addAttribute("leads",leads);
		return"list_leads";
		
	}
	@RequestMapping("/deleteLead")
	public String deleteLead(@RequestParam("id") long id,ModelMap model) {
		leadService.deleteOneMethod(id);
		List<Lead> leads = leadService.listallleads();
		model.addAttribute("leads",leads);
		return"list_leads";
	}
	@RequestMapping("/updateLead")
	public String updateLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getById(id);
		model.addAttribute("lead",lead);
		return"update_lead";
	}
	
	@RequestMapping(value="/updateonelead" ,method=RequestMethod.POST)
	public String updateonelead(@ModelAttribute("lead") Lead l,ModelMap model) {
		leadService.savelead(l);
		List<Lead> leads = leadService.listallleads();
		model.addAttribute("leads",leads);
		return"list_leads";
		
	}
	
	

}
