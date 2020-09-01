package JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitAnnotation.class, SanityPack.class, RegressionPack.class})


public class Runner {

}
