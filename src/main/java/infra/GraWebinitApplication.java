package infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import h2db.service.MemberService;

@SpringBootApplication
public class GraWebinitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraWebinitApplication.class, args);

		System.err.println("프로그램 실행 = GraWebinitApplication " ); //:TODO(lamune): Debug
		MemberService.main(null);


	}
}
