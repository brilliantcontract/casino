package bc.csn.history;

import bc.csn.history.Queue;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class QueueTest {

    @Test
    public void testCommonMethods() throws Exception {
        Queue<Integer> queue = new Queue(3);
        
        assertThat(queue.size(), is(0));
        assertThat(queue.capacity(), is(3));
        
        queue.push(0);
        assertThat(queue.get(0), is(0));
        assertThat(queue.size(), is(1));
        assertThat(queue.capacity(), is(3));
        
        queue.push(1);
        assertThat(queue.get(0), is(1));
        assertThat(queue.get(1), is(0));
        assertThat(queue.size(), is(2));
        assertThat(queue.capacity(), is(3));
        
        queue.push(2);
        assertThat(queue.get(0), is(2));
        assertThat(queue.get(1), is(1));
        assertThat(queue.get(2), is(0));
        assertThat(queue.size(), is(3));
        assertThat(queue.capacity(), is(3));
        
        queue.push(3);
        assertThat(queue.get(0), is(3));
        assertThat(queue.get(1), is(2));
        assertThat(queue.get(2), is(1));
        assertThat(queue.size(), is(3));
        assertThat(queue.capacity(), is(3));
    }

}