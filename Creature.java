public class Creature {
   int health;
   
   public Creature() {
      this.health = 100;
   }
   
   public Creature(int health) {
      this.health = health;
   }
   
   public void checkDead(String cause) {
      if (health <= 0)
         System.out.println(this + " was slain by " + cause + ".");
   }
}