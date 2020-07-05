import java.util.HashSet;
import java.util.Set;

public class PropertyCollection {

  private Set<Property> properties;

  public PropertyCollection(){
    this.properties = new HashSet<>();
  }

  // Add a property to the collection
  public void addProperty(Property p){
    properties.add(p);
  }

  // Return the set of all houses in the collection
  public Set<House> getHouses(){
    Set<House> houses = new HashSet<>();
    for (Property property : properties){
      if (property instanceof House){
        houses.add((House) property);
      }
    }
    return houses;
  }

  // Return the set of all bungalows in the collection
  public Set<Bungalow> getBungalows(){
    Set<Bungalow> bungalows = new HashSet<>();
    for (Property property : properties){
      if (property instanceof Bungalow){
        bungalows.add((Bungalow) property);
      }
    }
    return bungalows;
  }

  // Return the set of all flats in the collection
  public Set<Flat> getFlats(){
    Set<Flat> flats = new HashSet<>();
    for (Property property : properties){
      if (property instanceof Flat){
        flats.add((Flat) property);
      }
    }
    return flats;
  }

  // Return the set of all maisonettes in the collection
  public Set<Maisonette> getMaisonettes(){
    Set<Maisonette> maisonettes = new HashSet<>();
    for (Property property : properties){
      if (property instanceof Maisonette){
        maisonettes.add((Maisonette) property);
      }
    }
    return maisonettes;
  }

  // Return the set of all terraced houses in the collection
  public Set<TerracedHouse> getTerracedHouses(){
    Set<TerracedHouse> terracedHouses = new HashSet<>();
    for (Property property : properties){
      if (property instanceof House){
        terracedHouses.add((TerracedHouse) property);
      }
    }
    return terracedHouses;
  }
}
