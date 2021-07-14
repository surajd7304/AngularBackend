package com.jbk.AngularBackend;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class AngularBackendApplication {
	
	//1.create logger Object
	private static Logger log =Logger.getLogger(AngularBackendApplication.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AngularBackendApplication.class, args);
		
		//2.create layout
		Layout layout = new SimpleLayout();
		Layout layout2= new HTMLLayout();
		Layout layout3= new PatternLayout("%p %d %C %M %m %n");
		
		
		//3.add appender
		Appender appender= new ConsoleAppender(layout);
		Appender appender1= new ConsoleAppender(layout2);
		Appender appender2= new ConsoleAppender(layout3);
		Appender appender3=new FileAppender(layout3, "D:/jbk/industrial/data.log");
		
		//4.link appender to logger
		log.addAppender(appender);
		//log.addAppender(appender1);
		log.addAppender(appender2);
		log.addAppender(appender3);
		
		//print msg
		
		log.debug("debug msg");
		log.info("info msg");
		log.warn("warn msg");
		log.error("error msg");
		log.fatal("fatal msg");
		
		
		
	}

}
