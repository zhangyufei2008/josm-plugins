// License: GPL. For details, see LICENSE file.
package gpxfilter;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.gui.MainMenu;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

public class GpxFilterPlugin extends Plugin {

    public GpxFilterPlugin(PluginInformation info) {
        super(info);
        MainMenu.add(Main.main.menu.gpsMenu, new AddEGpxLayerAction(), false, 0);
    }

}
