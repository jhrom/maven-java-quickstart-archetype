#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void testApp() {
        assertThat(true).isTrue();
    }
}
