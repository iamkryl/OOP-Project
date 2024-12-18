public abstract class Enemy {
    private final String name;
    private int health;
    private final String skill;
 
    public Enemy(String name, int health, String skill) {
       this.name = name;
       this.health = health;
       this.skill = skill;
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
 
    public String getSkill() {
       return this.skill;
    }
 }
