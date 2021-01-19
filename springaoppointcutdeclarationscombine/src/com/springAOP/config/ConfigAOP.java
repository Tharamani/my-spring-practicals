/**
 * 
 */
package com.springAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Thara
 *@creation date & time: 7 Dec 2020 10:58:52 pm
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.springAOP")
public class ConfigAOP {

}
