/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rwl.codejam.utils.CJFileReader;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rwl
 */
public class ReadFileTest {

    public ReadFileTest() {

    }

    @Test
    public void readerMustReadTotalLineNumber() {
        CJFileReader reader;
        try {
            reader = new CJFileReader("src/main/resources/a-small-practice.in");
            assertEquals(100, reader.getTotalLineNumber());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
