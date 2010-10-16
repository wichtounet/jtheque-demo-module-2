package org.jtheque.demos.second;

import org.jtheque.ui.UIUtils;
import org.jtheque.ui.utils.actions.JThequeAction;

import javax.annotation.Resource;

import java.awt.event.ActionEvent;

/*
 * This file is part of JTheque.
 * 	   
 * JTheque is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License. 
 *
 * JTheque is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JTheque.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * An action to display Hello World
 *
 * @author Baptiste Wicht
 */
public final class HelloWorldAction extends JThequeAction {
    @Resource
    private UIUtils uiUtils;

    /**
     * Create a new HelloWorldAction.
     */
    public HelloWorldAction() {
        super("dialog.message");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        uiUtils.displayI18nText("dialog.message");
    }
}
