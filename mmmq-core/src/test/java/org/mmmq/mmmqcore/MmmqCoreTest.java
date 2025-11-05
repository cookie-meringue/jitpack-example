package org.mmmq.mmmqcore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MmmqCoreTest {

    @Test
    void testGetVersion() {
        MmmqCore core = new MmmqCore();
        assertEquals("1.0.0", core.getVersion());
    }
}