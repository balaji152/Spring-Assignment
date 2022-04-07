package SpringSecurityDemo1;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity //this tell spring that it is a web security configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		       .withUser("BHARGAV SAI")
		       .password("blah")// we save password n hashcode
		       .roles("USER")
		       .and()
		       .withUser("BALAJI")
		       .password("balaji")// we save password n hashcode
		       .roles("ADMIN");
		       
		       
		       
		       // by giving roles only the required person can use
	}
     @Bean
     public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
    	 
     }

	
	
	  @Override protected void configure(HttpSecurity http) throws Exception {
	  
	  http.authorizeRequests()
	  
	  .antMatchers("/admin").hasRole("ADMIN")
	  .antMatchers("/user").hasAnyRole("USER","ADMIN")
	  .antMatchers("/demo").permitAll() 
	  .and().formLogin();
	  
	  }
	  
}
	  

	  
	 
	
	
	
		


