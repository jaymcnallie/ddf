/**
 * Copyright (c) Codice Foundation
 * <p/>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
package org.codice.ddf.configuration.store;

import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.util.Dictionary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.service.cm.ConfigurationAdmin;

@RunWith(MockitoJUnitRunner.class)
public class ConfigurationFileTest {

    @Mock
    private Path path;

    @Mock
    private Dictionary<String, Object> properties;

    @Mock
    private ConfigurationAdmin configAdmin;

    private class ConfigurationFileUnderTest extends ConfigurationFile {
        public ConfigurationFileUnderTest(Path configFilePath,
                Dictionary<String, Object> properties, ConfigurationAdmin configAdmin) {
            super(configFilePath, properties, configAdmin);
        }

        @Override
        public void createConfig() throws ConfigurationFileException {
        }
    }

    @Test
    public void constructor() {
        ConfigurationFileUnderTest configurationFile = new ConfigurationFileUnderTest(path,
                properties, configAdmin);
        assertThat(configurationFile.getConfigFilePath(), sameInstance(path));
    }
}
