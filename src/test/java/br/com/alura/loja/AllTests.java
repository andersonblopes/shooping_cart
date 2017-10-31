package br.com.alura.loja;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClienteTest.class, ProjetoTest.class })
public class AllTests {
}
