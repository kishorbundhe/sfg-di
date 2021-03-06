package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
  public PrototypeBean() {
    System.out.println("Prototype Bean constructor called");
  }

  public void getMyScope() {
    System.out.println("Prototype Scope");
  }
}
