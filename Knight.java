public class Knight extends Human {
   
   int attackDamage;
   
   public Knight() {
      super(200);
      attackDamage = 10;
   }
   
   public Knight(int attackDamage) {
      this();
      this.attackDamage = attackDamage;
   }
   
   public Knight(int attackDamage, int health) {
      super(health);
      this.attackDamage = attackDamage;
   }
   
   public void attack(Creature c) {
      c.health -= this.attackDamage;
      c.checkDead("a Knight");
   }
   
}