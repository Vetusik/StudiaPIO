package game;

import players.PlayerComp;
import statistics.Statistics;
import statistics.WinStatistics;

import java.util.ArrayList;
import java.util.List;

import players.PlayerComp;
import statistics.WinStatistics;

public class Main {

	public static void main(String[] args) {

      WinStatistics stats = new WinStatistics();
		
		Game game = new Game();

		
        game.addPlayer(new PlayerComp("Marian"));
        game.addPlayer(new PlayerComp("Marian"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.removePlayer("Marian");
        
		game.play();
		
        for (int i=0; i<100; ++i) {
            game.play();
        }
        
        System.out.println("******** STATYSTYKI *********");
        stats.print();
		
	}
}

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostk� (losuje liczby z zakresu 1..6)
 * - gracz (te� komputer) stara si� odgadn�� liczb� (te� losuje)
 * - je�eli odgadnie, gra si� ko�czy
 * - je�eli nie odgadnie, rozpoczyna si� kolejna runda (komputer losuje kolejn� liczb� i gracz stara si� j� odgadn��)
 */