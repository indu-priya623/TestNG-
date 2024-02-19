package testNG.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNG.library.AdminLoginUtil;
import testNG.library.Branch;

public class CreatingNewBranch extends AdminLoginUtil
{
  @Parameters({"Bname","Add","code","country","state","city"})
  @Test
  public  void creatingNewBranch(String Bname,String Add,String code,String country,String state,String city) throws Throwable
  {
	  Branch br  = new Branch();
	  br.branchCreation(Bname,Add,code,country,state,city);
  }
}
