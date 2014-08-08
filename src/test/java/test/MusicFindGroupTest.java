package test;

import test.forms.MainPageForm;
import test.forms.MusicForm;
import webdriver.BaseTest;

public class MusicFindGroupTest extends BaseTest {
	
public void runTest() {
	
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm goToMusic = new MainPageForm();
	goToMusic.GoToMusic();
	logger.step(3);
	MusicForm music = new MusicForm();
	music.AssertMusic();
	logger.step(4);
	music.FindGroup("ДДТ");			
	}

}
