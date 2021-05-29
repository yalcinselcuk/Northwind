package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //swagger i baslatir.api leri yayinlanabilir hale tasir
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
	@Bean //bir class'tir.konfigürasyon icin kullanilir.bellege yerlestirir.
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))   //package name           
          .build();                                           
    }

}
//postgresql ile configurasyonu 
//src/main/resources ==> application.properties eklendi
