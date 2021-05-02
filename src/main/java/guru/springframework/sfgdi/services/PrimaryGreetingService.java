package guru.springframework.sfgdi.services;

import jdk.jfr.SettingDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - FROM a PRIMARY Bean";
    }
}
