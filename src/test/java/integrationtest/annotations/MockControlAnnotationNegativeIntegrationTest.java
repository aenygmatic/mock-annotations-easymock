/*
 * Copyright 2013 Balazs Berkes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package integrationtest.annotations;

import org.junit.Test;

import org.easymock.annotation.EasyMockAnnotations;
import org.easymock.annotation.MockControl;

/**
 * Integration test for exception type when {@link MockControl @MockContol} annotation is placed on incorrect type of
 * field.
 * <p>
 * @author Balazs Berkes
 */
public class MockControlAnnotationNegativeIntegrationTest {

    @MockControl
    private Thread incorrectType;

    @Test(expected = RuntimeException.class)
    public void testInitializeShouldThrowExceptionWhenControlTypeIsIncorrect() {
        EasyMockAnnotations.initialize(this);
    }
}
