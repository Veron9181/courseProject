package test.classes;
import test.forms.*;

public class MusicFindGroupClass extends MainPageForm{

	public void MusicFindGroup() {
		
		logger.step(1);
		MainPageForm goToMusic = new MainPageForm();
		goToMusic.GoToMusic();
		logger.step(2);
		MusicForm music = new MusicForm();
		music.AssertMusic();
		logger.step(3);
		music.FindGroup("ДДТ");
		}
}
