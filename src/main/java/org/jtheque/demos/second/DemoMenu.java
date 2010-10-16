package org.jtheque.demos.second;

/*
 * Copyright JTheque (Baptiste Wicht)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jtheque.features.Feature;
import org.jtheque.ui.utils.actions.JThequeAction;
import org.jtheque.views.utils.AbstractMenu;

import javax.annotation.Resource;

import java.util.List;

/**
 * The demo menu.
 *
 * @author Baptiste Wicht
 */
public final class DemoMenu extends AbstractMenu {
    @Resource
    private JThequeAction helloWorldAction;

    @Override
    protected List<Feature> getFileMenuSubFeatures() {
        return features(
                createSubFeature(150, helloWorldAction)
        );
    }
}