package live;

import music.*;
import music.string.*;
import music.wind.*;

public class Test {

	public static void main(String[] args) {
		Veena vn = new Veena();
		vn.play();
		Saxophone sp = new Saxophone();
		sp.play();
		playable p1 = vn;
		playable p2 = sp;
		p1.play();
		p2.play();

	}

}
