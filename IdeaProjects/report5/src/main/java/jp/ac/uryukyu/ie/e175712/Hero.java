package jp.ac.uryukyu.ie.e175712;

public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    @Override
    public void attack(LivingThing opponent){
        int damage = (int) (Math.random() * getAttack());
        int random = (int) (Math.random() * 100);
        if (getDead() == false) {
            if (random < 40) {
                if (damage == 0) {
                    System.out.printf("%sの攻撃！会心の一撃！！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName(), damage);
                } else {
                    System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage * 2);
                    opponent.wounded(damage * 2);
                }
            } else {
                if (damage == 0) {
                    System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName(), damage);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
            }
        }
    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}