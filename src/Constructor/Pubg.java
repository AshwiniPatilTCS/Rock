package Constructor;

public class Pubg {
	public static void main(String[] args) {
		Gun g1=new Gun();
		g1.gunName="AK47";
		g1.noOfBullets=6;
		g1.shoot();
		
		Gun g2=new Gun();
		g2.gunName="PISTOL";
		g2.noOfBullets=10;
		g2.shoot();
	}

}
