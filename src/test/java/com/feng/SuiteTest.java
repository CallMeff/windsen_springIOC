package com.feng;

import com.feng.annotation.DogPlayTest;
import com.feng.java.CowPlayTest;
import com.feng.xml.CatPlayTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by TTfly on 2017/5/7.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DogPlayTest.class,CatPlayTest.class, CowPlayTest.class})
public class SuiteTest {

}
