package demo.test.classes;
import demo.test.forms.*;

public class MusicFindGroupClass extends MusicFindGroupForm{

	public void MusicFindGroup() {
		
		logger.step(1);
		MusicFindGroupForm mfg = new MusicFindGroupForm();
		mfg.GoToMusic();
		logger.step(2);
		mfg.FindGroup();
		}
}
