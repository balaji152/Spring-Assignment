package SpringRestAssignment8;

import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class AdminController {
		@Autowired
		private AdminRepository repository;
		
		@RequestMapping(value="/all")
		public List<Admin>findAll(){
			return repository.findAll();
		}
		
		@RequestMapping(value="/{item}")
		public Admin findByItem(@PathVariable String item) {
			return repository.findByItem(item);
		
		}
		
		@RequestMapping(value="/load",method=RequestMethod.POST)
		public Admin load(@RequestBody Admin admin) {
		repository.save(admin);
		return repository.findByItem(admin.getItem());
		}
		
		
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public void delete(@PathVariable Integer id) {
		     repository.deleteById(id);
		}
		
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public void update(@RequestBody  Admin admin) {
		     repository.save(admin);
		}
		
		
		
	}
		
		
		
		
		