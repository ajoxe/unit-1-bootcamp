/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
      Cat garfield = new Cat();
      garfield.setName("Garfield");
      garfield.setAge(4);
      garfield.setFavoriteFood("Lasagna");

      Cat pinkPanther = new Cat();
      pinkPanther.setName("Pink Panther");
      pinkPanther.setAge(25);
      pinkPanther.setFavoriteFood("Whiskey");

      Cat catWoman = new Cat();
      catWoman.setName("Catwoman");
      catWoman.setAge(42);
      catWoman.setFavoriteFood("Robin");
  }

  public static boolean isOlder (Cat a, Cat b){
      return a.getAge()>b.getAge();
  }

  public static void makeBestFriends(Cat a, Cat b){
      b.setFavoriteFood(a.getFavoriteFood());
  }

  public static Cat makeKitten(Cat a, Cat b){
      Cat kitten = new Cat();
      kitten.setAge(0);
      kitten.setName(a.getName() + b.getName());
      return kitten;
  }

  public static void adoption(Cat c, Person p){
      if (c.getName().equals("Catwoman")){
          System.out.println("Catwoman will never be anyone's pet!");
      }
      c.setOwner(p);
  }

  public static boolean isFree(Cat c){
      return c.getOwner() == null;
  }

  public static boolean isSibling(Cat a, Cat b){
      return a.getOwner() == b.getOwner();
  }
}
