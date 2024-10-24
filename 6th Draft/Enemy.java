public abstract class Enemy {
   private final String name;
   private int health;
   private final String skill1;
   private final String skill2; // Can be null if there's only one skill

   // Constructor for enemies with 1 skill
   public Enemy(String name, int health, String skill1) {
       this.name = name;
       this.health = health;
       this.skill1 = skill1;
       this.skill2 = null;
   }

   // Constructor for enemies with 2 skills
   public Enemy(String name, int health, String skill1, String skill2) {
       this.name = name;
       this.health = health;
       this.skill1 = skill1;
       this.skill2 = skill2; // Two skills
   }

   public String getName() {
       return this.name;
   }

   public int getHealth() {
       return this.health;
   }

   public void setHealth(int health) {
       this.health = health;
   }

   public String getSkill1() {
       return this.skill1;
   }
   
   public String getSkill2() {
       return this.skill2; // Can return null if no second skill
   }
}
