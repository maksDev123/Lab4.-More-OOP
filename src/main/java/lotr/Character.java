package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter @AllArgsConstructor 
public abstract class Character{
    private KickStrategy kickStrategy;
    private int hp;
    private int power;

    public Character(int hp, int power, KickStrategy kickStrategy){
        this.hp = hp;
        this.power = power;
        this.kickStrategy = kickStrategy;
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    protected void setPower(int new_power){
        this.power = new_power;        
    }
    public void setHp(int hp){
        this.hp = hp > 0 ? hp: 0;
    }

    public void kick(Character opponent){
        this.kickStrategy.kick(this, opponent);
    }
    // public void ki
}
