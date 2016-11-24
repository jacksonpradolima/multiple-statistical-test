/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.multiple.statistical.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class FriedmanTest {    

    @Test
    public void testFriedman() {
        Friedman.main(new String[]{"src\\main\\resources\\test.csv"});
    }    
}
