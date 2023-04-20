public class Villager extends Human {
   House home;
   
   public Villager() {
      this.home = new House();
   }

   public Villager(House house) {
      this.home = house;
   }
}