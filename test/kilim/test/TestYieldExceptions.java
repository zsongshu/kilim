/* Copyright (c) 2006, Sriram Srinivasan
 *
 * You may distribute this software under the terms of the license 
 * specified in the file "License"
 */

package kilim.test;

import junit.framework.TestCase;

public class TestYieldExceptions extends TestCase {
    /*
     * exception thrown in a pausable method. The
     * catch handler does not make any pausable calls 
     */
    public void testOrdinaryCatch()  throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(0));
    }
    
    /*
     * pausable method throws an exception and the
     * catch handler makes a pausable call as well 
     */
    public void testPausableCatch() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(1));
    }
    
    /*
     * catch handler throws and catches another exception
     */ 
    public void testNestedException() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(2));
    }
    
    /*
     * try/finally surrounds try/catch. lots of exceptions
     * and pauses all around
     */ 
    public void testTryCatchFinally() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(3));
    }
    
    
    public void testPausableBlocksBeforeCatch() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(4));
    }

    public void testRestoreBeforeDefine() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(5));
    }
    public void testWhileCatch() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(6));
    }
    public void testRestoreArgument() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(7));
    }
    public void testCorrectException() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(8));
    }

    public void testPureCatch()  throws Exception {
        TestYield.runPure(new kilim.test.ex.ExCatch.Pure());
    }
    public void testPausableInvokeCatch() throws Exception {
        TestYield.runTask(new kilim.test.ex.ExCatch(9));
    }
}
