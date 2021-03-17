package guru.springframework.pets;

// @Profile({"dog", "default"})
// @Service("dog")
public class DogPetService implements PetService {
  public String getPetType() {
    return "Dogs are the best!";
  }
}
