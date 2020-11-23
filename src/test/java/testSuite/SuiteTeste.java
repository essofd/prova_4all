package testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCases.DesafioDoisTestCase;
import testCases.DesafioUmTestCase;
import utils.Report;


@RunWith(Suite.class)
@SuiteClasses({
	DesafioUmTestCase.class,
	DesafioDoisTestCase.class
})
public class SuiteTeste {
	@BeforeClass
	public static void inicializaTeste() {
		Report.createReport("Testando Site 4all ", "Suite de Regress�o");
	}
	@AfterClass
	public static void finalizaTeste() {
		Report.exit();
	}
}