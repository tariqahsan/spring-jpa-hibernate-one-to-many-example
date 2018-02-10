package org.tahsan.jpa.springjpahibernateexample.resource;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tahsan.jpa.springjpahibernateexample.model.Users;
import org.tahsan.jpa.springjpahibernateexample.model.UsersContact;
import org.tahsan.jpa.springjpahibernateexample.model.UsersLog;
import org.tahsan.jpa.springjpahibernateexample.repository.UsersContactRepository;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactResource {

    private UsersContactRepository usersContactRepository;

    public UsersContactResource(UsersContactRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

   /* @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> addPerson(@RequestBody UsersContact usersContact) {
		return new ResponseEntity<>(usersContactRepository.save(usersContact), HttpStatus.CREATED);
	}*/
    
    @PostMapping(value = "/add")
    public List<UsersContact> create(@RequestBody final UsersContact usersContact){
    	System.out.println("Inserting data into tables ...");
    	usersContactRepository.save(usersContact);
    	
    	
    	//UsersContact usersContact = new UsersContact();
        /*Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        users.setTeamName("Development")
                .setSalary(10000)
                .setName("Tausif")
                .setUsersLogs(Arrays.asList(usersLog, usersLog2));

        usersContact.setPhoneNo(11111)
                .setUsers(users);

        //persist
        usersContactRepository.save(usersContact);*/

    	return usersContactRepository.findAll();
    }
    
    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();
        Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        /*users.setTeamName("Development")
                .setSalary(10000)
                .setName(name)
                .setUsersLogs(Arrays.asList(usersLog, usersLog2));

        usersContact.setPhoneNo(11111)
                .setUsers(users);
*/
        //persist
        usersContactRepository.save(usersContact); 

        //getall
        return usersContactRepository.findAll();


    }


}
