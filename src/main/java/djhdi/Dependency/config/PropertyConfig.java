package djhdi.Dependency.config;/* Author is:Deepak Singh Jangra as Administrator 
    created on 15-08-2020 13:21 */

import djhdi.Dependency.beans.FakeDataSource;
import djhdi.Dependency.beans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {



    @Value("${djh.user}")
    String user;
    @Value("${djh.password}")
    String password;
    @Value("${djh.url}")
    String url;

    @Value("${djh.jms.user}")
    String jmsuser;
    @Value("${djh.jms.password}")
    String jmspassword;
    @Value("${djh.jms.url}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker= new FakeJmsBroker();
        fakeJmsBroker.setJmsuser(jmsuser);
        fakeJmsBroker.setJmspassword(jmspassword);
        fakeJmsBroker.setJmsurl(jmsurl);
        return fakeJmsBroker;
    }
  /*  @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
