package guru.springframework.pets;

//@Profile("cat")
//@Service("cat")
public class CatPetService implements PetService {
  @Override
  public String getPetType() {
    return "Cats Are the Best!";
  }
}
