package factory;
public class ModernFurnitureFactory implements FurnitureFactory{
  @Override
  public Chair createChair() {
    return new ModernChair
  }

  @Override
  public Sofa createSofa() {
    
  }

  
}
