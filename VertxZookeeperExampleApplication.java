package in.bhavanishankar.vertxzookeeperexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class VertxZookeeperExampleApplication {

//	@Autowired
//	private EventHandler consumer;
//
//	@Autowired
//	private EventConsumer producer;

//	@Autowired
//	private Vertx vertx;

//	@Value("${deployment.type}")
//	private String deployment_type;

	public static void main(String[] args) {
		SpringApplication.run(VertxZookeeperExampleApplication.class, args);
	}

//	@PostConstruct
//	public void deployVerticles(){
//		if (deployment_type.equalsIgnoreCase("producer")) {
//			log.info("Deploying Producer mate!!!");
//			vertx.deployVerticle(producer);
//		} else {
//			log.info("Deploying Consumer mate!!!");
//			vertx.deployVerticle(consumer);
//		}
//	}
}
