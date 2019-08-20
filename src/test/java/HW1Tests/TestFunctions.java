package HW1Tests;

import HW1.Functions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestFunctions {

    Functions f;
    List<Integer> list;
    @BeforeEach
    void setup(){
        f = new Functions();
    }

    @Test
    @DisplayName("Test List Add")
    void testListAdd(){
        list = new ArrayList<Integer>();
        list.add(1); list.add(2); list.add(3);
        assertNotNull(f);
        assertTrue(f.listAdd(list) == 6);
        list.add(4); list.add(5); list.add(6);
        assertFalse(f.listAdd(list) == 20);
    }
}
