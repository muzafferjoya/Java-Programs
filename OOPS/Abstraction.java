abstract class Character{

	public int lives=1;
	public float health=100;
	public abstract void ReduceHealth(int damage);
}
class Enemy extends Character{
		public Enemy(){
		System.out.println("Constructor");
	}
		public Enemy(int i){
		lives=1;
	}
		@Override
		public void ReduceHealth(int damage){
		health-=damage;
	}
}
class SuperEnemy extends Character{
		public SuperEnemy(){
		this.health=1000;
	}
		public void ReduceHealth(int damage){
		health-=damage*2;
	}
}
public class Abstraction{

	public static void main(String[] args) {
		Enemy e1=new Enemy();
		System.out.println(e1.health);
		e1.ReduceHealth(1);
		System.out.println(e1.health);

		SuperEnemy se=new SuperEnemy();
		System.out.println(se.health);
		se.ReduceHealth(1);
		System.out.println(se.health);

		
	}
}