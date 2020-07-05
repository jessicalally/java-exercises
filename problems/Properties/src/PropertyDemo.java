public class PropertyDemo {

  public static void main(String[] args) {
    PropertyCollection properties = new PropertyCollection();
    for (int i = 0; i < 1000; i++){
      properties.addProperty(new SemidetachedHouse());
      properties.addProperty(new TerracedHouse());
    }
    for (int i = 0; i < 100; i++){
      properties.addProperty(new DetachedHouse());
      properties.addProperty(new SemidetachedBungalow());
      properties.addProperty(new Flat());
    }
    for (int i = 0; i < 20; i++){
      properties.addProperty(new DetachedBungalow());
      properties.addProperty(new TerracedBungalow());
    }

    assert (properties.getHouses().size() == 2240);
    assert (properties.getBungalows().size() == 140);
    assert (properties.getFlats().size() == 120);
    assert (properties.getMaisonettes().size() == 20);
    assert (properties.getTerracedHouses().size() == 1020);
  }

}
