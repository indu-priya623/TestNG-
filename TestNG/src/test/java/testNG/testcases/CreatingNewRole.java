package testNG.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNG.library.AdminLoginUtil;
import testNG.library.Roles;

public class CreatingNewRole extends AdminLoginUtil
{
@Parameters({"RoleName","RoleName","Role"})
@Test
public  void CreatingRole(String RoleName,String RoleDesk,String Role)
{
  Roles r = new Roles();
  r.RoleCreation(RoleName,RoleDesk,Role);
}
}
