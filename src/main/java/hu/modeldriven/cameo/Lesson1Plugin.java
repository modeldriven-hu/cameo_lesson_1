package hu.modeldriven.cameo;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.plugins.Plugin;

public class Lesson1Plugin extends Plugin {

    @Override
    public void init() {
        Application.getInstance().getGUILog().showMessage("Hello world from Lesson1");
    }

    @Override
    public boolean close() {
        return true;
    }

    @Override
    public boolean isSupported() {
        return true;
    }
}
