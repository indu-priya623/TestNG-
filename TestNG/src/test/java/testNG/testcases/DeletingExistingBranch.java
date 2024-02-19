package testNG.testcases;

import org.testng.annotations.Test;

import testNG.library.AdminLoginUtil;
import testNG.library.Branch;

public class DeletingExistingBranch extends AdminLoginUtil 
{
@Test
public void DeletingBranch() throws Throwable
{
	Branch br = new Branch();
	br.branchDeletion();
}
}
