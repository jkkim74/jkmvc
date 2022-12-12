package mvc.jkmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JkmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JkmvcApplication.class, args);
	}

}
