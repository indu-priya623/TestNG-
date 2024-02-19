package testNG.testcases;

import org.testng.annotations.Test;

import testNG.library.AdminLoginUtil;
import testNG.library.Roles;

public class DeletingExistingRole extends AdminLoginUtil
{
@Test
 public void DeletingRole()
 {
	 Roles r = new Roles();
	 r.RoleDeletion();
 }
}
