public class Enemy {
    private final String name;
    private int health;
    private final String skill;
 
    public Enemy(String var1, int var2, String var3) {
       this.name = var1;
       this.health = var2;
       this.skill = var3;
    }
 
    public String getName() {
       return this.name;
    }
 
    public int getHealth() {
       return this.health;
    }
 
    public void setHealth(int var1) {
       this.health = var1;
    }
 
    public String getSkill() {
       return this.skill;
    }
 }
