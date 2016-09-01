package br.cefetmg.games.minigames.factories;

import br.cefetmg.games.minigames.MiniGame;
import br.cefetmg.games.minigames.util.StateChangeObserver;
import br.cefetmg.games.screens.BaseScreen;

/**
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public interface MiniGameFactory {

    public MiniGame createMiniGame(BaseScreen screen, 
            StateChangeObserver observer, float difficulty);
}