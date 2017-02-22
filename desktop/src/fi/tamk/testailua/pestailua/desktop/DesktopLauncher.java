package fi.tamk.testailua.pestailua.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fi.tamk.testailua.pestailua.TestailuaPestailua;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 800;
        config.height = 480;
        config.title = "paras peli :D";
		new LwjglApplication(new TestailuaPestailua(), config);
	}
}
